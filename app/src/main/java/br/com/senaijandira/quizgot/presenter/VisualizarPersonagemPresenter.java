package br.com.senaijandira.quizgot.presenter;

import android.util.Log;

import java.util.List;

import br.com.senaijandira.quizgot.Activity.VisualizarPersonagem;
import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.service.PersonagemService;
import br.com.senaijandira.quizgot.view.VisualizarPersonagemView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VisualizarPersonagemPresenter {

    VisualizarPersonagemView personagemView;
    PersonagemService service;

    public VisualizarPersonagemPresenter(VisualizarPersonagemView personagemView, PersonagemService service){
        this.personagemView = personagemView;
        this.service = service;
    }
     public  void RetornarPersonagem(int id){
        service.obterPersonagem(id).enqueue(new Callback<Personagem>() {
            @Override
            public void onResponse(Call<Personagem> call, Response<Personagem> response) {
                personagemView.carregarPersonagemPorId(response.body());
            }

            @Override
            public void onFailure(Call<Personagem> call, Throwable t) {
                Log.d("saddasdasda", t.getMessage());
            }
        });

     }
}
