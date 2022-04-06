package com.example.exercciorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.exercciorecyclerview.dataset.CursoDataset;
import com.example.exercciorecyclerview.models.Curso;
import com.example.exercciorecyclerview.recyclerpessoa.CursoAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listCurso;
    private CursoAdapter cursoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listCurso = (RecyclerView) findViewById(R.id.listCurso);
        setupRecyclerCurso();;
    }

    public void buttonAddClick(View view){
        cursoAdapter.addItem(new Curso(0, "TESTE TESTE", 300, "TODOS"));
    }

    public void setupRecyclerCurso(){
        //Formato de lista vetical
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listCurso.setLayoutManager(layoutManager);
        cursoAdapter = new CursoAdapter(CursoDataset.getItens());
        listCurso.setAdapter(cursoAdapter);
        listCurso.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }
}