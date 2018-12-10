package br.com.senaijandira.quizgot.presenter;

import java.util.List;

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
        service.obterPersonagem(id).enqueue(new Callback<List<Personagem>>() {
            @Override
            public void onResponse(Call<List<Personagem>> call, Response<List<Personagem>> response) {
                personagemView.carregarPersonagemPorId(response.body().get(0));
            }

            @Override
            public void onFailure(Call<List<Personagem>> call, Throwable t) {

            }
        });

     }
}
