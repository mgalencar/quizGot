package br.com.senaijandira.quizgot.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.model.Casas;
import de.hdodenhof.circleimageview.CircleImageView;

public class CasasAdapter extends ArrayAdapter<Casas>{

    public CasasAdapter(Context ctx){
        super(ctx,0,new ArrayList<Casas>());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        if(v == null){
            v = LayoutInflater.from(getContext()).inflate(R.layout.casas, parent, false);
        }
        Casas casas = getItem(position);

        TextView txtLema = v.findViewById(R.id.txtLema);
        TextView txtRegiao = v.findViewById(R.id.txtRegiao);
        TextView txtMembros = v.findViewById(R.id.txtMembros);
        TextView txtSede = v.findViewById(R.id.txtSede);
        TextView txtDescricao = v.findViewById(R.id.txtDescricao);
        TextView txtNome = v.findViewById(R.id.txtNomeCasa);

        CircleImageView imagemCasas = v.findViewById(R.id.imagemCasa);
        String url_foto = getContext().getString(R.string.URL_IMAGEM)+casas.getFoto_casa();
        Picasso.get().load(url_foto).into(imagemCasas);

        txtNome.setText(casas.getNome());
        txtLema.setText(casas.getLema());
        txtRegiao.setText(casas.getRegiao());
        txtSede.setText(casas.getSede());
        txtMembros.setText(casas.getMembros());
        txtDescricao.setText(casas.getDescricao());

        return v;
    }
}
