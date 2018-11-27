package br.com.senaijandira.quizgot.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.adapter.PersonagensAdapter;
import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.service.PersonagemService;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FragmentsPersonagens extends Fragment{

    PersonagensAdapter personagemAdapter;

    ListView lstpersonagens;

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

        return v;
    }

    public void carregarPersonagem(){

        PersonagemService service = ServiceFactory.create();

        Call<List<Personagem>> call = service.obterPersonagem();

        call.enqueue(new Callback<List<Personagem>>() {
            @Override
            public void onResponse(Call<List<Personagem>> call, Response<List<Personagem>> response) {
                List<Personagem> personagens = response.body();

                for(Personagem a : personagens){
                    Log.d("AQUIIIIIIIIIIIIII", a.getNome());
                }
                preencherLista(personagens);
            }

            @Override
            public void onFailure(Call<List<Personagem>> call, Throwable t) {
                Log.d("ERRO ", "DEU ERRO");
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        carregarPersonagem();
    }

    public void preencherLista (List<Personagem> personagem) {
        personagemAdapter.clear();
        personagemAdapter.addAll(personagem);
    }
}
