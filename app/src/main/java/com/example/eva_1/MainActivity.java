package com.example.eva_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Button ingreso;
    ProgressBar pb_circulito;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingreso=findViewById(R.id.btn_ingreso);
        pb_circulito=findViewById(R.id.progressBar);
        pb_circulito.setVisibility(View.INVISIBLE);

        ingreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb_circulito.setVisibility(View.VISIBLE);

                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;
                        pb_circulito.setProgress(counter);
                        if (counter==100){
                            timer.cancel();
                            Intent opcion = new Intent(MainActivity.this, eva_2.class);
                            startActivity(opcion);
                        }
                    }
                };
                timer.schedule(timerTask, 50,50);
            }
        });


    }
}