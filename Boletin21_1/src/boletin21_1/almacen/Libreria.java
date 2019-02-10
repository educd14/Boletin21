/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21_1.almacen;

import Utilidades.PedirDatos;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mirroriced
 */
public class Libreria {

    public void engadir(ArrayList<Libros> lista) {
        lista.add(new Libros(PedirDatos.string("Título"), PedirDatos.string("Autor"), PedirDatos.string("ISBN"),
                PedirDatos.decimal("Prezo"), PedirDatos.enteiro("Unidades")));
    }

    public void forIterator(ArrayList<Libros> lista) throws Erros {
        if (lista.isEmpty() == true) {
            throw new Erros("O Array está vacío");
        } else {
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void vender(int pos, ArrayList<Libros> lista) throws Erros {
        if (lista.isEmpty() == true) {
            throw new Erros("O Array está vacío");
        } else {
            lista.remove(pos);
        }
    }

    public void baixa(int unidades, ArrayList<Libros> lista) throws Erros {
        if (lista.isEmpty() == true) {
            throw new Erros("O Array está vacío");
        } else {
            Libros lib = new Libros();
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                lib = (Libros) it.next();
                if (unidades == lib.getUnidades()) {
                    lista.remove(lib);
                }
            }
        }
    }

    public void consultar(String titulo, ArrayList<Libros> lista) throws Erros {
        if (lista.isEmpty() == true) {
            throw new Erros("O Array está vacío");
        } else {

            for (Libros lib : lista) {
                if (titulo.equalsIgnoreCase(lib.getAutor())) {
                    System.out.println(lib.toString());
                }

            }
        }
    }
}
