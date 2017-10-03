package br.com.alura.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        //cria array
        String[] alunos = {"Daniel", "Ronaldo", "Jeferson", "Felipe"};
        //variavel da lista de alunos 'ListView'
        ListView listaAlunos = (ListView) findViewById(R.id.lista_alunos);
        //cria variavel adapter, popula simple_list_item_1 com o array alunos
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        //seta o adapter para a ListView
        listaAlunos.setAdapter(adapter);

    }
}
