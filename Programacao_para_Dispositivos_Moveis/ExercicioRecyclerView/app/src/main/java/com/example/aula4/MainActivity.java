package com.example.aula4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.aula4.dataset.PessoaDatatset;
import com.example.aula4.models.Pessoa;
import com.example.aula4.recyclerpessoa.PessoaAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listPessoa;
    private PessoaAdapter pessoaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listPessoa = (RecyclerView) findViewById(R.id.listPessoa);
        setupRecyclerPessoa();
    }


    public void buttonAddClick(View view){
        pessoaAdapter.addItem(new Pessoa(999, "ITEM ADD", "000000"));
    }

    public  void setupRecyclerPessoa(){
        //Formato de Grid
        //GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        //Formato de lista horizontal
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        //Formato de lista vetical
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listPessoa.setLayoutManager(layoutManager);
        pessoaAdapter = new PessoaAdapter(PessoaDatatset.getItens());
        listPessoa.setAdapter(pessoaAdapter);
        listPessoa.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }


}