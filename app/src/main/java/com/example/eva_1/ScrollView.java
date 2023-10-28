package com.example.eva_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ScrollView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
    }

    public void Seleccion (View View){
        String cadena = getResources().getResourceEntryName(View.getId());
        Toast.makeText(this, "los niños estan en su momento de "  +cadena, Toast.LENGTH_SHORT).show();
    }
}