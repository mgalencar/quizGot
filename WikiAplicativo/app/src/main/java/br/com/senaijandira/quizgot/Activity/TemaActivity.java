package br.com.senaijandira.quizgot.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import br.com.senaijandira.quizgot.Activity.QuizActivity;
import br.com.senaijandira.quizgot.R;

public class TemaActivity extends Activity {

    Button btnPersonagens, btnCasas;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);
    }

    public void btnPersonagens (View v){

        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);

    }

//    public void btnCasas (View v){
//
//        Intent intent = new Intent(this, QuizActivity.class);
//        startActivity(intent);
//
//    }
}
