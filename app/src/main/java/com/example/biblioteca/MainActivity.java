package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                // Abre la Activity de búsqueda
                Intent searchIntent = new Intent(this, MainActivity.class);
                startActivity(searchIntent);
                return true;
            case R.id.action_settings:
                // Abre la Activity de ajustes/configuraciones
                Intent settingsIntent = new Intent(this, Perfil.class);
                startActivity(settingsIntent);
                return true;
            case R.id.subir:
                // Abre la Activity para subir recursos
                Intent uploadIntent = new Intent(this, Subir_libros.class);
                startActivity(uploadIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}