/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21_1.almacen;

import java.util.Objects;

/**
 *
 * @author Mirroriced
 */
public class Libros implements Comparable {
    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int unidades;

    public Libros() {
    }

    public Libros(String titulo, String autor, String ISBN, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " Autor: " + autor + " ISBN: " + ISBN + " Prezo: " + prezo + " Unidades: " + unidades;
    }
    
    @Override
    public int compareTo(Object o){
        Libros lib = (Libros)o;
        if(this.titulo.compareToIgnoreCase(lib.titulo)>0)
            return 1;
        else if(this.titulo.compareToIgnoreCase(lib.titulo)<0)
            return -1;
        else
            return 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libros other = (Libros) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    
}
