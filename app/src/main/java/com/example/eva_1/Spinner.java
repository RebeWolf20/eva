package com.example.eva_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Spinner extends AppCompatActivity {
    android.widget.Spinner spinner;
    TextView resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner=findViewById(R.id.spinner);
        resp=findViewById(R.id.txv_respuesta);

        String[] respuesta = {"fuego", "agua", "aire", "tierra"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, respuesta);
        spinner.setAdapter(adapter);
    }

    public void Mostrar(View view){
        String select = spinner.getSelectedItem().toString();
        if(select.equals("fuego")){
            resp.setText("Haz que el fuergo arda en ti.");
        }else if (select.equals("agua")){
            resp.setText("Fluye como el agua.");
        }else if (select.equals("aire")){
            resp.setText("Se libre como el viento.");
        }else if (select.equals("tierra")){
            resp.setText("Haz crecer tus sueños como la tierra.");
        }

    }
    public void Menu (View view){
        Intent opt = new Intent(this,MainActivity.class);
        startActivity(opt);

    }
}
