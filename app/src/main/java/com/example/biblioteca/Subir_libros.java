package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Subir_libros extends AppCompatActivity {

    private List<Libro> listaLibros;
    private LibrosAdapter librosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subir_libros);

        // Inicializar la lista de libros
        listaLibros = new ArrayList<>();

        librosAdapter = new LibrosAdapter(this, listaLibros);


        // Configurar el RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewLibrosIndex);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(librosAdapter);

        // Botón para subir recurso
        Button btnSubirRecurso = findViewById(R.id.SubirRecurso);
        btnSubirRecurso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Libro nuevoLibro = new Libro("Título del nuevo libro", "Autor del nuevo libro");


                listaLibros.add(nuevoLibro);

                librosAdapter.notifyDataSetChanged();
            }
        });
    }
}