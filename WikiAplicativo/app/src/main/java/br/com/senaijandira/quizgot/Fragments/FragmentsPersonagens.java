package br.com.senaijandira.quizgot.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.com.senaijandira.quizgot.Activity.CadastroPersonagensActivity;
import br.com.senaijandira.quizgot.Activity.VisualizarPersonagem;
import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.adapter.PersonagensAdapter;
import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.presenter.ListaPresenter;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import br.com.senaijandira.quizgot.view.ListaView;


public class FragmentsPersonagens extends Fragment implements ListaView, AdapterView.OnItemClickListener{

    PersonagensAdapter personagemAdapter;

    ListView lstpersonagens;
    FloatingActionButton cadastrarPersonagem;

    ListaPresenter listaPresenter;
    public FragmentsPersonagens(){


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_personagem,container, false);

        lstpersonagens = v.findViewById(R.id.lstpersonagens);

        personagemAdapter = new PersonagensAdapter(getContext());

        lstpersonagens.setAdapter(personagemAdapter);

        lstpersonagens.setOnItemClickListener(this);

        cadastrarPersonagem = v.findViewById(R.id.cadastrarPersonagem);
        cadastrarPersonagem.setOnClickListener(btnCadastrarPersonagem);

        //Configurando o presenter
        listaPresenter = new ListaPresenter(this, ServiceFactory.create());

        return v;
    }

    View.OnClickListener btnCadastrarPersonagem = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), CadastroPersonagensActivity.class);
            startActivity(intent);
        }

    };

    @Override
    public void onResume() {
        super.onResume();
        listaPresenter.carregarPersonagem();
    }

    @Override
    public void PreencherListaPersonagens (List<Personagem> personagem) {
        personagemAdapter.clear();
        personagemAdapter.addAll(personagem);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getContext(),"Teste",Toast.LENGTH_LONG);
        Personagem personagem = personagemAdapter.getItem(position);

        Intent intent = new Intent(getContext(), VisualizarPersonagem.class);
        intent.putExtra("id_personagem", personagem.getId_personagens());

        startActivity(intent);
    }
}
