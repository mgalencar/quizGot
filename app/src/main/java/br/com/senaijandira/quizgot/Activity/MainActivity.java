package br.com.senaijandira.quizgot.Activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import br.com.senaijandira.quizgot.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTitulo= findViewById(R.id.txtTitulo);
        Typeface fonte = Typeface.createFromAsset(getAssets(),"Game of Thrones.ttf");

        txtTitulo.setTypeface(fonte);

    }

    public void btnInicio (View v){

//        Intent intent = new Intent(this,TemaActivity.class);
//        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Quiz em desenvolvimento",Toast.LENGTH_SHORT);
        Toast.makeText(this,"Quiz em desenvolvimento",Toast.LENGTH_SHORT);

    }
    public void txtLista (View v){

        Intent intent = new Intent(this, ListaActivity.class);
        startActivity(intent);

    }








}
