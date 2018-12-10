package br.com.senaijandira.quizgot.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.model.Personagem;

public class PersonagensAdapter extends ArrayAdapter<Personagem> {

    public PersonagensAdapter(Context ctx){

        super(ctx,0,new ArrayList<Personagem>());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        if(v == null){
            v = LayoutInflater.from(getContext()).inflate(R.layout.personagens, parent, false);
        }

        Personagem personagem = getItem(position);
        TextView txtNomePersonagem = v.findViewById(R.id.txtNomePersonagem);
        TextView txtGenero = v.findViewById(R.id.txtGenero);
        TextView txtReino = v.findViewById(R.id.txtReino);
        TextView txtCasa = v.findViewById(R.id.txtCasa);
        TextView txtHistoria = v.findViewById(R.id.txtHistoria);

        //Tratamento de imagens
        ImageView imagemPersonagem = v.findViewById(R.id.fotoPersonagem);
        String url_foto = getContext().getString(R.string.URL_IMAGEM)+personagem.getFoto_personagem();
        Picasso.get().load(url_foto).into(imagemPersonagem);
        //Fim tratamento de imagem


        txtNomePersonagem.setText(personagem.getNome_personagem());
        txtGenero.setText(personagem.getGenero());
        txtCasa.setText(personagem.getCasa());
        txtReino.setText(personagem.getReino());
        txtHistoria.setText(personagem.getDescricao());

        return v;
    }







}
