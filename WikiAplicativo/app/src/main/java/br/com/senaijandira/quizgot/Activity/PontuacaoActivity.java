package br.com.senaijandira.quizgot.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import br.com.senaijandira.quizgot.R;

public class PontuacaoActivity extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontuacao);
    }

    public void btnSair (View v){

        finish();

    }

    public void btnJogarNovamente (View v){

        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);

    }



}
