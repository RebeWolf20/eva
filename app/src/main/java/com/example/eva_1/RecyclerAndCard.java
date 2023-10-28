package com.example.eva_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAndCard extends AppCompatActivity {

    List<listaElementos> elementos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_and_card);

        init ();
    }

    public void init(){
        elementos = new ArrayList<>();
        elementos.add(new listaElementos("#fe7f2d", "Rebeca", "Santiago", "Activo"));
        elementos.add(new listaElementos("#0077b6", "David", "Mexico", "Activo"));
        elementos.add(new listaElementos("#adb5bd", "Jeison", "Colombia", "Activo"));
        elementos.add(new listaElementos("#0d1b2a", "Eric", "Cuba", "Cancelado"));
        elementos.add(new listaElementos("#ffb7ff", "Diego", "Temuco", "Activo"));
        elementos.add(new listaElementos("#7b2cbf", "Daniel", "Ciudad de Mexico", "Inactivo"));
        elementos.add(new listaElementos("#7bf1a8", "Jennifer", "Valdivia", "Pendiente"));

        ListaAdaptador listaAdaptador = new ListaAdaptador(elementos, this);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listaAdaptador);
    }
}