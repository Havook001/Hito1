package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class index extends AppCompatActivity {

    private RecyclerView recyclerViewLibrosIndex;
    private LibrosAdapter librosAdapterIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("Título del Libro 1", "Autor 1"));
        listaLibros.add(new Libro("Título del Libro 2", "Autor 2"));
// Agrega más libros según sea necesario

        LibrosAdapter librosAdapter = new LibrosAdapter(this, listaLibros);
        recyclerViewLibrosIndex.setAdapter(librosAdapter);
    }
}