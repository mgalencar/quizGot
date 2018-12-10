package br.com.senaijandira.quizgot.service;

import java.util.List;

import br.com.senaijandira.quizgot.model.ApiResult;
import br.com.senaijandira.quizgot.model.Casas;
import br.com.senaijandira.quizgot.model.Personagem;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PersonagemService {

    //String URL_BASE = "http://10.0.2.2:5001";
    //String URL_BASE = " http://192.168.0.101:5001";
    String URL_BASE = "http://192.168.0.107:5001";

    @GET("/personagens")
    Call<List<Personagem>> obterPersonagem();

    @GET("/personagem/{id}")
    Call<Personagem> obterPersonagem(@Path("id") int id_personagens);

    @POST("/novoPersonagem")
    Call<ApiResult>adicionarPersonagem(@Body Personagem personagem);

    @GET("/casas")
    Call<List<Casas>> obterCasas();


}
