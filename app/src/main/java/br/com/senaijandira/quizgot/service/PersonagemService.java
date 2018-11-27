package br.com.senaijandira.quizgot.service;

import java.util.List;

import br.com.senaijandira.quizgot.model.Personagem;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PersonagemService {

    String URL_BASE = "http://10.0.2.2:5001";

    @GET("/personagens")
    Call<List<Personagem>> obterPersonagem();
}
