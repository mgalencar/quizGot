package br.com.senaijandira.quizgot.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceFactory {

    public static PersonagemService create(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PersonagemService.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(PersonagemService.class);
    }

}
