package com.example.eva_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBox extends AppCompatActivity {
    android.widget.RadioButton radioButton;
    RadioGroup radioGroup;
    android.widget.CheckBox cb_animal;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        radioGroup=findViewById(R.id.radiogroup);
        cb_animal=findViewById(R.id.cb_animal);
        resultado=findViewById(R.id.txv_resul);

        cb_animal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    radioGroup.clearCheck();
                }
            }
        });
    }

    public void onClickbutton(View view) {
        String is = "";
        if (cb_animal.isChecked()) {
            is += "Animal";
        }

        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(selectedId);

        if (selectedId == -1) {
            Toast.makeText(this, "No ha seleccionado nada", Toast.LENGTH_SHORT).show();
        } else {
            is += "" + radioButton.getText();
            Toast.makeText(this, "Selección: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
        }
        resultado.setText(is);
    }

    public void Menu(View view){
        Intent menu = new Intent(this , MainActivity.class);
        startActivity(menu);
    }

}