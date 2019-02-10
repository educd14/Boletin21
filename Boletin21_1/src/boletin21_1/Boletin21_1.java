/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21_1;

import Utilidades.PedirDatos;
import boletin21_1.almacen.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mirroriced
 */
public class Boletin21_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Erros {
        ArrayList<Libros> lista = new ArrayList<>();
        Libreria obx = new Libreria();
        String op;
        do {
            op = PedirDatos.string("****MENU****"
                    + "\nEngadir"
                    + "\nVer"
                    + "\nVender"
                    + "\nBaixa"
                    + "\nOrdenar"
                    + "\nConsultar");
            switch (op) {
                case "Engadir":
                    obx.engadir(lista);
                    break;
                case "Ver":
                    System.out.println("\n\n\n\n\n");
                    obx.forIterator(lista);
                    break;
                case "Vender":
                    obx.vender(PedirDatos.enteiro("Posicion")-1, lista);
                    break;
                case "Baixa":
                    obx.baixa(PedirDatos.enteiro("Unidades"), lista);
                    break;
                case "Ordenar":
                    Collections.sort(lista);
                    break;
                case "Buscar":
                    obx.consultar(PedirDatos.string("Titulo"), lista);
                    break;
            }
        } while (!"Sair".equalsIgnoreCase(op));
    }    
        
}

