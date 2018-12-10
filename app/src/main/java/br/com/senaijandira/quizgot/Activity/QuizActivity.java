package br.com.senaijandira.quizgot.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.model.Personagem;

public class QuizActivity extends Activity{

    TextView txtQuiz, txtTempo;
    Button btn1, btn2, btn3, btn4;

    ImageView imgQuiz;
    int tempo = 30;
    int qtdJogadas = 5;
    int numeroAleatorio;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Personagem personagem = new Personagem();

        txtQuiz = findViewById(R.id.txt_quiz);
        txtTempo = findViewById(R.id.txt_tempo);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        imgQuiz = findViewById(R.id.img_quiz);

        //String resCerta =


    }






}
