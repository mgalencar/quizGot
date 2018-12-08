package br.com.senaijandira.quizgot.presenter;

import br.com.senaijandira.quizgot.model.ApiResult;
import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.service.PersonagemService;
import br.com.senaijandira.quizgot.view.CadastroPersonagensView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastrarPersonagemPresenter {


    //Instanciar as variaveis
    CadastroPersonagensView view;
    PersonagemService service;

    public  CadastrarPersonagemPresenter(CadastroPersonagensView view, PersonagemService service){
        this.view = view;
        this.service = service;
    }
    public void CadastrarPersonagemPresenter(Personagem personagem){
        service.adicionarPersonagem(personagem).enqueue(new Callback<ApiResult>() {
            @Override
            public void onResponse(Call<ApiResult> call, Response<ApiResult> response) {
                ApiResult result = response.body();
                if(result.isSucesso()){
                    view.showMessage("Sucesso", "Personagem adicionado");
                }else{
                    view.showMessage("Erro", "Erro ao cadastrar");
                }
            }
            @Override
            public void onFailure(Call<ApiResult> call, Throwable t) {
                view.showMessage("Erro", t.getMessage());
                t.printStackTrace();

            }
        });
    }

}


