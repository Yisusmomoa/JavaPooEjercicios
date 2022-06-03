/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseLibro;

/**
 *
 * @author bjls2
 */
public class Libro {
    
    private String tituloLibro;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String tituloLibro, String autor, int numeroEjemplares) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
    }

    public Libro(String tituloLibro, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }
    
    public boolean prestamo(){
        if (this.numeroEjemplares<this.numeroEjemplaresPrestados) {
            this.numeroEjemplares--;
            this.numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    } 
    
    public boolean devolucion(){
        this.numeroEjemplaresPrestados--;
        this.numeroEjemplares++;
        return true;
    } 
}
