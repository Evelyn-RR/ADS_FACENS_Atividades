package com.example.exercciorecyclerview.recyclerpessoa;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exercciorecyclerview.R;
import com.example.exercciorecyclerview.dataset.CursoDataset;
import com.example.exercciorecyclerview.models.Curso;

import java.util.ArrayList;

public class CursoAdapter extends RecyclerView.Adapter<CursoHolder> {
    private ArrayList<Curso> cursos;
    public CursoAdapter(ArrayList<Curso> cursos) {this.cursos = cursos; }

    @NonNull
    @Override
    public CursoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CursoHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.card_item_curso, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CursoHolder holder, int position) {
        holder.nome.setText(cursos.get(position).getNome());
        holder.valor.setText(cursos.get(position).getValor());
        holder.dia.setText(cursos.get(position).getDia());
        holder.buttonExcluir.setOnClickListener(view -> excluirItem(position));
    }

    private void excluirItem(int position){
        cursos.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,cursos.size());
    }

    @Override
    public int getItemCount() {return cursos != null ? cursos.size() : 0; }

    public void addItem(Curso curso){
        CursoDataset.addCurso(curso);
        notifyItemInserted(getItemCount());
    }
}
