package br.usjt.listarpaises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Rodrigo de Oliveira on 18/03/2018.
 * RA 816114365
 */
public class ListarPaises extends AppCompatActivity {
    public static final String DESCRICAO =
            "br.usjt.listarpaises.descricao";
    private List <String> lista;
    /**
     * Created by Rodrigo de Oliveira on 18/03/2018.
     * RA 816114365
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_listar_paises);
        Intent origemIntent = getIntent ( );

        String chave = origemIntent.getStringExtra (MainActivity.NOME);
        lista = buscaPaises(chave);
        ArrayAdapter <String> adapter =
                new ArrayAdapter <String> (this, android.R.layout.simple_list_item_1, lista);
        ListView listView =
                (ListView) findViewById (R.id.id_list);
        listView.setAdapter (adapter);
        listView.setOnItemClickListener (new AdapterView.OnItemClickListener ( ) {
            @Override
            public void onItemClick(AdapterView <?> adapterView, View view, int pos, long id) {
                Intent intent = new Intent (ListarPaises.this, DetalhePaisActivity.class);
                intent.putExtra (DESCRICAO, lista.get (pos));
                startActivity (intent);
            }
        });
    }
    /**
     * Created by Rodrigo de Oliveira on 18/03/2018.
     * RA 816114365
     */
    public ArrayList <String> geraListaPaises() {
        ArrayList <String> lista = new ArrayList <> ( );
        lista.add ("Africa/Angola.");
        lista.add ("Africa/Cameroon.");
        lista.add ("Africa/Republic of the Congo.");
        lista.add ("Africa/Egypt.");
        lista.add ("Africa/Ethiopia.");
        lista.add ("Africa/Nigeria.");
        lista.add ("Africa/Zimbabwe.");
        lista.add ("Africa/South Africa.");
        lista.add ("Africa/Ghana.");
        lista.add ("Americas/Argentina.");
        lista.add ("Americas/Bolivia.");
        lista.add ("Americas/Brazil.");
        lista.add ("Americas/Chile.");
        lista.add ("Americas/Colombia.");
        lista.add ("Americas/Paraguay.");
        lista.add ("Americas/Uruguay.");
        lista.add ("Americas/Canada.");
        lista.add ("Americas/Mexico.");
        lista.add ("Americas/United States of America (USA).");
        lista.add ("Americas/Guatemala.");
        lista.add ("Americas/Cuba.");
        lista.add ("Asia/Afghanistan.");
        lista.add ("Asia/China.");
        lista.add ("Asia /India.");
        lista.add ("Asia/ Iran.");
        lista.add ("Asia/Israel.");
        lista.add ("Asia/Japan.");
        lista.add ("Asia/North Korea.");
        lista.add ("Europe/Croatia.");
        lista.add ("Europe/Czerch Republic.");
        lista.add ("Europe /Finland.");
        lista.add ("Europe France.");
        lista.add ("Europe/Germany.");
        lista.add ("Europe/Italy.");
        lista.add ("Europe/Russia.");
        lista.add ("Oceania/Australia.");
        lista.add ("Oceania/Marshall Islands.");
        lista.add ("Oceania /New Zealand.");
        lista.add ("Oceania /Samoa.");
        lista.add ("Oceania/Tonga.");
        lista.add ("Oceania/Vanuatu.");
        return lista;
    }

    public ArrayList <String> buscaPaises(String chave) {
        ArrayList <String> lista = geraListaPaises( );
        if (chave == "ALL" || chave.length ( ) == 3) {
            return lista;
        } else {
            ArrayList <String> subLista = new ArrayList <> ( );
            for (String nome : lista) {
                if (nome.toUpperCase ( ).contains (chave.toUpperCase ( ))) {
                    subLista.add (nome);
                }
            }
            return subLista;
        }
    }
}