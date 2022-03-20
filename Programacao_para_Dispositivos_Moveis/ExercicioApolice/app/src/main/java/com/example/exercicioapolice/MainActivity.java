package com.example.exercicioapolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numero;
    double resultado;
    String nome;
    int idade;
    char sexo;
    String s;
    double valorAutomovel;
    Apolice apolice = new Apolice();

    public void CalcularClick(View view) {
        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        nome = editTextNome.getText().toString();
        EditText editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        idade = Integer.parseInt(editTextIdade.getText().toString());
        EditText editTextSexo = (EditText) findViewById(R.id.editTextSexo);
        s = editTextSexo.getText().toString();
        sexo = s.charAt(0);
        EditText editTextValor = (EditText) findViewById(R.id.editTextValorAutomovel);
        valorAutomovel = Double.parseDouble(editTextValor.getText().toString());
        //setando valores
        apolice.setNome(nome);
        apolice.setIdade(idade);
        apolice.setSexo(sexo);
        apolice.setValorAutomovel(valorAutomovel);
        //calculando
        EditText editTextResultado = (EditText) findViewById(R.id.editTextResultado);
        resultado = apolice.calcularValor();
        editTextResultado.setText(String.valueOf(resultado));
    }


}