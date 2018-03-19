package br.usjt.listarpaises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Rodrigo de Oliveira on 18/03/2018.
 * RA 816114365
 */
public class DetalhePaisActivity extends AppCompatActivity {
    private TextView nomeSelecionadoTextView;
    /**
     * Created by Rodrigo de Oliveira on 18/03/2018.
     * RA 816114365
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        nomeSelecionadoTextView =
                (TextView) findViewById(R.id.nomeSelecionadoTextView);
        Intent i = getIntent();
        String selecionado = i.getStringExtra(ListarPaises.DESCRICAO);
        if (selecionado.equals ("Americas/Argentina.")) {
            nomeSelecionadoTextView.setText ("Nome=Argentina\n"+"Capital=Buenos Aires\n"+"Região=Americas\n"+"População=43590400\n"+"Lingua=Espanhol");
        }else if (selecionado.equals ("Asia/Japan.")) {
            nomeSelecionadoTextView.setText("Nome=Japão\n" + "Capital=TOkyo\n" + "Região=Asia\n" + "População=127 milhões \n" + "Lingua=Japones");
        }
            else if (selecionado.equals("Oceania /New Zealand.")) {
                nomeSelecionadoTextView.setText("Nome=Nova Zelândia\n" + "Capital=Enseada do Peixe Voador\n" + "Região=Oceania\n" + "População=24117360 \n" + "Lingua=Inglês");
            }


        Toast.makeText (getApplicationContext (),""+selecionado,Toast.LENGTH_SHORT).show ();
    }
}
