package br.com.senaijandira.quizgot.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.List;

import br.com.senaijandira.quizgot.Fragments.FragmentsCasas;
import br.com.senaijandira.quizgot.Fragments.FragmentsPersonagens;
import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.adapter.PersonagensAdapter;
import br.com.senaijandira.quizgot.model.Personagem;
import br.com.senaijandira.quizgot.service.PersonagemService;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListaActivity extends AppCompatActivity {

    FragmentManager fm;
    TabLayout tab_menu;
    PersonagensAdapter personagemAdapter;

    PersonagemService service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        carregarPersonagem();

        tab_menu = findViewById(R.id.tab_menu);
        tab_menu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    openFragment1(null);
                }
                else if(tab.getPosition() == 1){
                    openFragment2(null);
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
        fm = getSupportFragmentManager();

    }

    public void carregarPersonagem(){

        PersonagemService service = ServiceFactory.create();

        Call<List<Personagem>> call = service.obterPersonagem();

        call.enqueue(new Callback<List<Personagem>>() {
            @Override
            public void onResponse(Call<List<Personagem>> call, Response<List<Personagem>> response) {
                List<Personagem> personagens = response.body();

                for(Personagem a : personagens){
                    Log.d("BATATA", a.getNome_personagem());
                }
            }

            @Override
            public void onFailure(Call<List<Personagem>> call, Throwable t) {
                Log.d("onResponse: ", "DEU ERRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOOOOOOO");
            }
        });


    }

    public void openFragment1(View view){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_layout, new FragmentsPersonagens());
        ft.commit();
    }
    public void openFragment2(View view){
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new FragmentsCasas());
        ft.commit();
    }

}
