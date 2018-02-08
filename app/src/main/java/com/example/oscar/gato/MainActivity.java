package com.example.oscar.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4,button5,button6,button7,button8;

    int contador=1;

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


        if(contador%2==0){
            if(button.getText().equals("")) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button.setText("X");
                        contador++;
                    }

                });
            }

            if(button2.getText().equals("")) {
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button2.setText("X");
                        contador++;
                    }

                });
            }

            if(button3.getText().equals("")) {
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button3.setText("X");
                        contador++;
                    }

                });
            }

            if(button4.getText().equals("")) {
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button4.setText("X");
                        contador++;
                    }

                });
            }

            if(button5.getText().equals("")) {
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button5.setText("X");
                        contador++;
                    }

                });
            }

            if(button6.getText().equals("")) {
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button6.setText("X");
                        contador++;
                    }

                });
            }

            if(button7.getText().equals("")) {
                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button7.setText("X");
                        contador++;
                    }

                });
            }

            if(button8.getText().equals("")) {
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button8.setText("X");
                        contador++;
                    }

                });
            }


        }else{
            if(button.getText().equals("")) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button.setText("O");
                        contador++;
                    }

                });
            }

            if(button2.getText().equals("")) {
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button2.setText("O");
                        contador++;
                    }

                });
            }

            if(button3.getText().equals("")) {
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button3.setText("O");
                        contador++;
                    }

                });
            }

            if(button4.getText().equals("")) {
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button4.setText("O");
                        contador++;
                    }

                });
            }

            if(button5.getText().equals("")) {
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button5.setText("O");
                        contador++;
                    }

                });
            }

            if(button6.getText().equals("")) {
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button6.setText("O");
                        contador++;
                    }

                });
            }

            if(button7.getText().equals("")) {
                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button7.setText("O");
                        contador++;
                    }

                });
            }

            if(button8.getText().equals("")) {
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button8.setText("O");
                        contador++;
                    }

                });
            }
        }

    }


}
