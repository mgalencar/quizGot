package br.com.senaijandira.quizgot.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
        txtNomePersonagem.setText(personagem.getNome());

        return v;
    }







}
