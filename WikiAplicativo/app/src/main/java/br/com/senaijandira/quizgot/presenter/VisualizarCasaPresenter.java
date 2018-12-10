package br.com.senaijandira.quizgot.presenter;

import java.util.List;

import br.com.senaijandira.quizgot.model.Casas;
import br.com.senaijandira.quizgot.service.PersonagemService;
import br.com.senaijandira.quizgot.view.VisualizarView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VisualizarCasaPresenter {


    VisualizarView casaView;
    PersonagemService service;
    public VisualizarCasaPresenter(VisualizarView casaView, PersonagemService service){
        this.casaView = casaView;
        this.service = service;
    }
    public void RetornarCasas(int id){
        service.obterCasasPorId(id).enqueue(new Callback<List<Casas>>() {
            @Override
            public void onResponse(Call<List<Casas>> call, Response<List<Casas>> response) {
                casaView.CarregarCasasPorId(response.body().get(0));
            }

            @Override
            public void onFailure(Call<List<Casas>> call, Throwable t) {

            }
        });
    }
}
