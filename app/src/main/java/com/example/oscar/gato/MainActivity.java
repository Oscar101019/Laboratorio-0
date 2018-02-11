package com.example.oscar.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4,button5,button6,button7,button8,button9,refresh;
    TextView textView;
    int contador=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        refresh = (Button)findViewById(R.id.nuevo);
        refresh.setEnabled(false);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button2);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button3);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button4);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button5);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button6);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
            }

        });

        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button7);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button8);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button9);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                button.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                textView.setText("");
                refresh.setEnabled(false);
                button.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
            }
        });



    }



    public boolean esVacio(Button boton){
        if(boton.getText().equals("")){
            return true;
        }
        return false;
    }


    public void imprimir(Button boton){
        if(esVacio(boton)){
            if(contador==2){
                boton.setText("X");
                contador=1;
            }else{
                boton.setText("O");
                contador=2;
            }

        }

    }

    public void quienGana(Button boton, Button boton2, Button boton3, Button boton4, Button boton5, Button boton6, Button boton7, Button boton8, Button boton9){
        if(boton.getText().toString()=="X" && boton2.getText().toString()=="X" && boton3.getText().toString()=="X" ||
        boton4.getText().toString()=="X" && boton5.getText().toString()=="X" && boton6.getText().toString()=="X" ||
        boton7.getText().toString()=="X" && boton8.getText().toString()=="X" && boton9.getText().toString()=="X" ||
        boton.getText().toString()=="X" && boton4.getText().toString()=="X" && boton7.getText().toString()=="X" ||
        boton2.getText().toString()=="X" && boton5.getText().toString()=="X" && boton8.getText().toString()=="X" ||
        boton3.getText().toString()=="X" && boton6.getText().toString()=="X" && boton9.getText().toString()=="X" ||
        boton.getText().toString()=="X" && boton5.getText().toString()=="X" && boton9.getText().toString()=="X" ||
        boton3.getText().toString()=="X" && boton5.getText().toString()=="X" && boton7.getText().toString()=="X" ){
            textView=(TextView) findViewById(R.id.textView);
            textView.setText("El ganador es el jugador 1");
            refresh.setEnabled(true);
            button.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
        else if(boton.getText().toString()=="O" && boton2.getText().toString()=="O" && boton3.getText().toString()=="O" ||
                boton4.getText().toString()=="O" && boton5.getText().toString()=="O" && boton6.getText().toString()=="O" ||
                boton7.getText().toString()=="O" && boton8.getText().toString()=="O" && boton9.getText().toString()=="O" ||
                boton.getText().toString()=="O" && boton4.getText().toString()=="O" && boton7.getText().toString()=="O" ||
                boton2.getText().toString()=="O" && boton5.getText().toString()=="O" && boton8.getText().toString()=="O" ||
                boton3.getText().toString()=="O" && boton6.getText().toString()=="O" && boton9.getText().toString()=="O" ||
                boton.getText().toString()=="O" && boton5.getText().toString()=="O" && boton9.getText().toString()=="O" ||
                boton3.getText().toString()=="O" && boton5.getText().toString()=="O" && boton7.getText().toString()=="O" ){
            textView=(TextView) findViewById(R.id.textView);
            textView.setText("El ganador es el jugador 2");
            refresh.setEnabled(true);
            button.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }

    }



}
