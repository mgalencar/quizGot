package br.com.senaijandira.quizgot.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import br.com.senaijandira.quizgot.Fragments.FragmentsCasas;
import br.com.senaijandira.quizgot.Fragments.FragmentsPersonagens;
import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.adapter.PersonagensAdapter;
import br.com.senaijandira.quizgot.model.Personagem;

public class ListaActivity extends AppCompatActivity {

    FragmentManager fm;
    TabLayout tab_menu;
    PersonagensAdapter personagemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        fm = getSupportFragmentManager();
        personagemAdapter = new PersonagensAdapter(this);

        tab_menu = findViewById(R.id.tab_menu);
        tab_menu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    AbrirListaPersonagens( null);
                }
                else if(tab.getPosition() == 1){
                    AbrirListaCasas(null);
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
        AbrirListaPersonagens(null);
    }

    public void AbrirListaPersonagens(View view){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_layout, new FragmentsPersonagens());
        ft.commit();
    }
    public void AbrirListaCasas(View view){
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new FragmentsCasas());
        ft.commit();
    }


}
