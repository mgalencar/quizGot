package br.com.senaijandira.quizgot.Activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.presenter.CadastrarPersonagemPresenter;
import br.com.senaijandira.quizgot.service.PersonagemService;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import br.com.senaijandira.quizgot.view.CadastroPersonagensView;

public class CadastroPersonagensActivity extends Activity implements CadastroPersonagensView, AdapterView.OnItemSelectedListener{

    EditText txtNome,txtTitulo, txtCasa, txtReino;
    Spinner genero;
    PersonagemService service = ServiceFactory.create();

    //Chamando a class presenter para executar o cadastro
    CadastrarPersonagemPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cadastro_personagem);
        //Mudando o estilo da fonte
        TextView tituloCadastro = findViewById(R.id.tituloCadastrar);
        Typeface fonte = Typeface.createFromAsset(getAssets(),"Game of Thrones.ttf");
        tituloCadastro.setTypeface(fonte);

        //Fazendo spinner
        genero = (Spinner) findViewById(R.id.cb_genero);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.cb_genero, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genero.setAdapter(adapter);
        genero.setOnItemSelectedListener(this);



        txtNome= findViewById(R.id.txt_nome_personagem);
        txtTitulo = findViewById(R.id.txt_titulo);
        txtReino = findViewById(R.id.txt_reino);
        txtCasa = findViewById(R.id.txt_casa);

        presenter = new CadastrarPersonagemPresenter((CadastroPersonagensView) this, service);

    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void salvarCadastroPersonagem(View view){


        String nome = txtNome.getText().toString();
        String titulo = txtTitulo.getText().toString();
        String casa = txtCasa.getText().toString();
        String reino = txtReino.getText().toString();
        //Pegando item selecionado no combo box
        String itemSelectSpinner = genero.getSelectedItem().toString();

        if(nome.equals("") || titulo.equals("") || casa.equals("") || reino.equals("")){
            alertGeral("Preencha todos os campos","Todos os campos são obrigatórios");
        }
        else{
            Personagem personagem = new Personagem();

            personagem.setNome_personagem(nome);
            personagem.setTitulo(titulo);
            personagem.setCasa(casa);
            personagem.setReino(reino);
            personagem.setGenero(itemSelectSpinner);

            presenter.CadastrarPersonagemPresenter(personagem);
        }

    }

    @Override
    public void showMessage(String titulo, String msg){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(msg);
        alert.setTitle(titulo);
        alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alert.show();


    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
    public void alertGeral(String titulo, String mensagem){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(mensagem);
        alert.setTitle(titulo);
        alert.show();
    }


}
