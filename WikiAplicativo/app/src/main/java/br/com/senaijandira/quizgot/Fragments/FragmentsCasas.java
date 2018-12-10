package br.com.senaijandira.quizgot.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import br.com.senaijandira.quizgot.Activity.VisualizarCasas;
import br.com.senaijandira.quizgot.R;
import br.com.senaijandira.quizgot.adapter.CasasAdapter;
import br.com.senaijandira.quizgot.model.Casas;
import br.com.senaijandira.quizgot.presenter.CasaPresenter;
import br.com.senaijandira.quizgot.service.ServiceFactory;
import br.com.senaijandira.quizgot.view.CasaView;

public class FragmentsCasas extends Fragment implements CasaView  ,AdapterView.OnItemClickListener{

    CasasAdapter casasAdapter;

    ListView lstCasas;
    CasaPresenter casaPresenter;
    public FragmentsCasas(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_casas,container, false);


        lstCasas = v.findViewById(R.id.lstcasas);
        casasAdapter = new CasasAdapter(getContext());

        lstCasas.setAdapter(casasAdapter);

       lstCasas.setOnItemClickListener(this);

        casaPresenter = new CasaPresenter(this, ServiceFactory.create());


        return v;

    }
    @Override
    public void onResume() {
        super.onResume();
        casaPresenter.carregarCasa();
    }


    @Override
    public void carregarCasas(List<Casas> lstCasas) {
        casasAdapter.clear();
        casasAdapter.addAll(lstCasas);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Casas casas = casasAdapter.getItem(position);

        Intent intent = new Intent(getContext(), VisualizarCasas.class);
        intent.putExtra("id_casas", casas.getId_casas());

        startActivity(intent);
    }
}
