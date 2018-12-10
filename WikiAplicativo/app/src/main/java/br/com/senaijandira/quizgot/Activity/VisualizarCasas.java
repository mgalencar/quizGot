package br.com.senaijandira.quizgot.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.model.Casas;
import br.com.senaijandira.quizgot.presenter.VisualizarCasaPresenter;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import br.com.senaijandira.quizgot.view.VisualizarView;

public class VisualizarCasas  extends Activity implements VisualizarView{
    TextView txtRegiao, txtSede, txtMembros, txtNome,txtDescricao, txtLema;
    ImageView imagemCasas;
    VisualizarCasaPresenter casaPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_casas);

        int id_casas = getIntent().getIntExtra("id_casas",0);

        txtNome = findViewById(R.id.txtNomeCasaComplete);
        txtRegiao = findViewById(R.id.txtRegiaoCasa);
        txtLema = findViewById(R.id.txtLemaCasas);
        txtMembros = findViewById(R.id.txtMembrosCasa);
        txtSede = findViewById(R.id.txtSedeCasa);
        txtDescricao = findViewById(R.id.txtHistoriaCasas);

        imagemCasas = findViewById(R.id.fotoCasasCompleto);

        casaPresenter = new VisualizarCasaPresenter(this, ServiceFactory.create());
        casaPresenter.RetornarCasas(id_casas);
    }

    @Override
    public void CarregarCasasPorId(Casas casas) {
        txtNome.setText(casas.getNome());
        txtRegiao.setText(casas.getRegiao());
        txtLema.setText(casas.getLema());
        txtMembros.setText(casas.getMembros());
        txtSede.setText(casas.getSede());
        txtDescricao.setText(casas.getDescricao());

        String url_foto = this.getString(R.string.URL_IMAGEM)+casas.getFoto_casa();
        Picasso.get().load(url_foto).into(imagemCasas);

    }



}
