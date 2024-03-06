package com.example.calculadoraaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numeroUno = findViewById(R.id.NumeroUno);
        final EditText  numeroDos = findViewById(R.id.NumeroDos);
        final RadioGroup radioGroup = findViewById(R.id.RadioGroup);
        final RadioButton sumar = findViewById(R.id.Sumar);
        final RadioButton restar = findViewById(R.id.Restar);
        final Button BotonCalcular = findViewById(R.id.Calcular);
        final TextView mostrarResultado = findViewById(R.id.Resultado);


        BotonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int valueOne = Integer.parseInt(numeroUno.getText().toString());
                final int valueTwo = Integer.parseInt(numeroUno.getText().toString());
                Integer respuesta;

                final int radioDecision = radioGroup.getCheckedRadioButtonId();
                if( radioDecision == sumar.getId()){
                    respuesta = valueOne + valueTwo;
                }
                else {respuesta = valueOne - valueTwo;}

                mostrarResultado.setText(respuesta.toString());

            }
        });
    }


}