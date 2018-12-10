package br.com.senaijandira.quizgot.presenter;

import android.util.Log;

import java.util.List;

import br.com.senaijandira.quizgot.model.Casas;
import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.service.PersonagemService;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import br.com.senaijandira.quizgot.view.CasaView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CasaPresenter {
    CasaView casaView;
    PersonagemService service;

    public CasaPresenter(CasaView casaView, PersonagemService service){
        this.casaView = casaView;
        this.service = service;
    }

    public void carregarCasa(){
        PersonagemService service = ServiceFactory.create();

        Call<List<Casas>> call = service.obterCasas();
        call.enqueue(new Callback<List<Casas>>() {
            @Override
            public void onResponse(Call<List<Casas>> call, Response<List<Casas>> response) {
                List<Casas> casas = response.body();
                casaView.carregarCasas(casas);
            }

            @Override
            public void onFailure(Call<List<Casas>> call, Throwable t) {
                Log.d("ERRO ", "Não foi possivel carregar as casas");
            }
        });
    }

}
