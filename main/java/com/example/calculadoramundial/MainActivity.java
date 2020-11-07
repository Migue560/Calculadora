package com.example.calculadoramundial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static java.lang.Integer.parseInt;


public class MainActivity extends AppCompatActivity {

    private EditText Valor01, Valor02;
    private RadioButton Oper01,Oper02,Oper03,Oper04,Oper05,Oper06,Oper07;
    private Button Boton01;
    private TextView Textosal;
    private Math sin, cos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Valor01 = (EditText) findViewById(R.id.editTextText1);
        Valor02 = (EditText) findViewById(R.id.editTextText2);
        Oper01 = (RadioButton) findViewById(R.id.radioButton);
        Oper02 = (RadioButton) findViewById(R.id.radioButton2);
        Oper03 = (RadioButton) findViewById(R.id.radioButton3);
        Oper04 = (RadioButton) findViewById(R.id.radioButton4);
        Oper05 = (RadioButton) findViewById(R.id.radioButton5);
        Oper06 = (RadioButton) findViewById(R.id.radioButton6);
        Oper07 = (RadioButton) findViewById(R.id.radioButton7);
        Boton01 = (Button) findViewById(R.id.button);
        Textosal = (TextView) findViewById(R.id.textView2);

    }
    public double calcular(View v){
        double resultado = 0;
        if ((Valor01.getText().length() == 0 && Valor02.getText().length()== 0)) {
                return 0;
            }
        if ((Valor01.getText().length() == 0 && Oper03.isChecked())) {
            return 0;
        }
        if ((Valor02.getText().length() == 0 && Oper03.isChecked())) {
            return 0;
        }
        if ((Valor02.getText().length() == 0 && Oper04.isChecked())) {
            return 0;
        }
            if ((Valor02.getText().length() > Valor01.getText().length()) && Oper04.isChecked()) {
                return 0;
            }
        if ((Valor01.getText().length()) == 0  && Oper07.isChecked()) {
            return 0;
        }

        if(Oper01.isChecked()){//suma
            resultado = Integer.valueOf(String.valueOf(Valor01.getText()))+Integer.valueOf(String.valueOf(Valor02.getText()));
            Textosal.setText(String.valueOf(resultado));
                    }
        if(Oper02.isChecked()){//resta
                    resultado = Integer.valueOf(String.valueOf(Valor01.getText()))-Integer.valueOf(String.valueOf(Valor02.getText()));
                    Textosal.setText(String.valueOf(resultado));
                        }
         if(Oper03.isChecked()){//multiplicacion
                resultado = Integer.valueOf(String.valueOf(Valor01.getText()))*Integer.valueOf(String.valueOf(Valor02.getText()));
                Textosal.setText(String.valueOf(resultado));
                        }
        if(Oper04.isChecked()){//divisio
            resultado = Integer.valueOf(String.valueOf(Valor01.getText()))/Integer.valueOf(String.valueOf(Valor02.getText()));
            Textosal.setText(String.valueOf(resultado));
        }

        if(Oper05.isChecked()){//SENO

            String valor1=Valor01.getText().toString();
            int nro1=Integer.parseInt(valor1);
            double suma=Math.sin(Math.toRadians(nro1));
            String resul=String.valueOf(suma);
            Textosal.setText(resul);
        }
        if(Oper06.isChecked()){//COSENO
            String valor1=Valor01.getText().toString();
            int nro1=Integer.parseInt(valor1);
            double suma=Math.cos(Math.toRadians(nro1));
            String resul=String.valueOf(suma);
            Textosal.setText(resul);
        }
        if(Oper07.isChecked()){//raiz
            String valor1=Valor01.getText().toString();
            int nro1=Integer.parseInt(valor1);
            double suma=Math.sqrt(nro1);
            String resul=String.valueOf(suma);
            Textosal.setText(resul);
        }
        return resultado;
    }

}