package br.com.senaijandira.quizgot.Activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.presenter.VisualizarPersonagemPresenter;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import br.com.senaijandira.quizgot.view.VisualizarPersonagemView;

public class VisualizarPersonagem extends Activity implements VisualizarPersonagemView {
    TextView txtNomePersonagem, txtGenero, txtCasa, txtReino,txtHistria;
    ImageView imagemPersonagem;
    VisualizarPersonagemPresenter presenter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.info_geral);

        int id_personagem = getIntent().getIntExtra("id_personagem",0);

        txtNomePersonagem = findViewById(R.id.txtNomePersonagemCompleto);
        txtCasa = findViewById(R.id.txtCasaPersonagem);
        txtReino = findViewById(R.id.txtReinoPersonagem);
        txtGenero = findViewById(R.id.txtGeneroPersonagem);
        txtHistria = findViewById(R.id.txtHistoriaPersonagem);

        imagemPersonagem = findViewById(R.id.fotoPersonagemCompleto);


        presenter = new VisualizarPersonagemPresenter(this, ServiceFactory.create());
        presenter.RetornarPersonagem(id_personagem);

    }


    @Override
    public void carregarPersonagemPorId(Personagem personagem) {
        txtNomePersonagem.setText(personagem.getNome_personagem());
        txtGenero.setText(personagem.getGenero());
        txtCasa.setText(personagem.getCasa());
        txtHistria.setText(personagem.getDescricao());
        txtReino.setText(personagem.getReino());
        
        String url_foto = this.getString(R.string.URL_IMAGEM)+personagem.getFoto_personagem();
        Picasso.get().load(url_foto).into(imagemPersonagem);
    }
}
