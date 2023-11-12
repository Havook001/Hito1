package com.example.biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    // Puedes agregar más campos según sea necesario

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }



}
