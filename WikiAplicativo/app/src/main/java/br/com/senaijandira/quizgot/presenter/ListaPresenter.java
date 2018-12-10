package br.com.senaijandira.quizgot.presenter;


import android.util.Log;

import java.util.List;

import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.service.PersonagemService;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import br.com.senaijandira.quizgot.view.ListaView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListaPresenter {

    ListaView listaView;
    PersonagemService service;

    public ListaPresenter(ListaView listaView, PersonagemService service){
        this.listaView = listaView;
        this.service = service;
    }
    public void carregarPersonagem(){


        PersonagemService service = ServiceFactory.create();

        Call<List<Personagem>> call = service.obterPersonagem();

        call.enqueue(new Callback<List<Personagem>>() {
            @Override
            public void onResponse(Call<List<Personagem>> call, Response<List<Personagem>> response) {
                List<Personagem> personagens = response.body();

                listaView.PreencherListaPersonagens(personagens);
            }

            @Override
            public void onFailure(Call<List<Personagem>> call, Throwable t) {
                Log.d("ERRO ", "DEU ERRO");
            }
        });


    }

}
