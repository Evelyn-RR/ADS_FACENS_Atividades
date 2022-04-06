package com.example.exercciorecyclerview.dataset;

import com.example.exercciorecyclerview.models.Curso;

import java.util.ArrayList;

public class CursoDataset {
    private static ArrayList<Curso> cursos;

    public static ArrayList<Curso> getItens() {
        cursos = new ArrayList<>();
        cursos.add(new Curso(1, "Musicalização Infantil nível I", 125, "segunda ou terça-feira de manhã"));
        cursos.add(new Curso(2, "Musicalização Infantil nível II", 135, "quarta ou quinta-feira de manhã"));
        cursos.add(new Curso(3, "Musicalização Infantil nível III", 145, "quinta ou sexta-feira de manhã"));
        cursos.add(new Curso(4, "Musicalização básica", 150, "quinta ou sexta-feira a tarde"));
        cursos.add(new Curso(5, "Piano clássico", 200, "segunda, terça ou sexta de manhã"));
        return cursos;
    }

    public static void addCurso(Curso curso){
        cursos.add(curso);
    }

}
