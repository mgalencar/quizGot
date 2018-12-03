package br.com.senaijandira.quizgot.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.adapter.PersonagensAdapter;
import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.presenter.ListaPresenter;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import br.com.senaijandira.quizgot.view.ListaView;


public class FragmentsPersonagens extends Fragment implements ListaView{

    PersonagensAdapter personagemAdapter;

    ListView lstpersonagens;

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

        //Configurando o presenter
        listaPresenter = new ListaPresenter(this, ServiceFactory.create());

        return v;
    }



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

}
