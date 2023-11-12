package com.example.biblioteca;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LibrosAdapter extends RecyclerView.Adapter<LibrosAdapter.LibroViewHolder> {

    private Context context;
    private List<Libro> listaLibros; // Asegúrate de tener una clase Libro y una lista de libros

    public LibrosAdapter(Context context, List<Libro> listaLibros) {
        this.context = context;
        this.listaLibros = listaLibros;
    }

    @NonNull
    @Override
    public LibroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_subir_libros, parent, false);
        return new LibroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LibroViewHolder holder, int position) {
        Libro libro = listaLibros.get(position);

        // Configurar los elementos de la vista con la información del libro
        holder.textViewTitulo.setText(libro.getTitulo());
        holder.textViewAutor.setText(libro.getAutor());
    }

    @Override
    public int getItemCount() {
        return listaLibros.size();
    }

    // Clase ViewHolder para representar cada elemento de la lista
    public static class LibroViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitulo, textViewAutor;

        public LibroViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
            textViewAutor = itemView.findViewById(R.id.textViewAutor);
        }
    }
}
