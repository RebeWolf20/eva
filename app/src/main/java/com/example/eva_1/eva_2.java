package com.example.eva_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class eva_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eva2);
    }

    public void Btn_mixto (View view){
        Intent mixto = new Intent(this , layout_mixto.class);
        startActivity(mixto);
    }
    public void Btn_spinner (View view){
        Intent spinner = new Intent(this , Spinner.class);
        startActivity(spinner);
    }

    public void ScrollView (View view){
        Intent scrollview = new Intent(this , ScrollView.class);
        startActivity(scrollview);
    }

    public void ReciclerAndCard (View view){
        Intent reciclerAndCard  = new Intent(this , RecyclerAndCard.class);
        startActivity(reciclerAndCard);
    }

    public void CheckBox (View view){
        Intent chexbox  = new Intent(this , CheckBox.class);
        startActivity(chexbox);
    }

    public void Menu(View view){
        Intent menu = new Intent(this , MainActivity.class);
        startActivity(menu);
    }


}
