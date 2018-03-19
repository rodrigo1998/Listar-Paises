package br.usjt.listarpaises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import android.widget.Spinner;
import android.widget.Toast;
/**
 * Created by Rodrigo de Oliveira on 18/03/2018.
 * RA 816114365
 */

public class MainActivity extends AppCompatActivity {

    private Spinner sp;
    public static final String NOME = "br.usjt.listarpaises.nome";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner)
                findViewById(R.id.id_spinner);

        ArrayAdapter adapter= ArrayAdapter.createFromResource (this, R.array.continentes, R.layout.support_simple_spinner_dropdown_item);
        sp.setAdapter (adapter);


    }
    /**
     * Created by Rodrigo de Oliveira on 18/03/2018.
     * RA 816114365
     */

    public void ListarChamados(View view){

        Intent intent = new Intent (this,ListarPaises.class);
        String nome = sp.getSelectedItem ().toString();
        intent.putExtra(NOME, nome);
        startActivity(intent);
    }



}
