package br.com.senaijandira.quizgot.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.senaijandira.quizgot.R;

public class MainActivity extends AppCompatActivity {

    Button btnInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnInicio (View v){

        Intent intent = new Intent(this,TemaActivity.class);
        startActivity(intent);

    }
    public void txtLista (View v){

        Intent intent = new Intent(this, ListaActivity.class);
        startActivity(intent);

    }








}