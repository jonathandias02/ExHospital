package jonathan.exerciciohospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Intent intent = getIntent();
        if(intent != null){
            Bundle reg = intent.getExtras();
            if(reg != null){
                String nome, leito, pressao, batimentos, temperatura;
                nome = reg.getString("nome");
                leito = reg.getString("leito");
                pressao = reg.getString("pressao");
                batimentos = reg.getString("batimentos");
                temperatura = reg.getString("temperatura");

                TextView lblnome, lblleito, lblpressao, lblbatimentos, lbltemperatura;

                lblnome = (TextView)findViewById(R.id.lbl_nome);
                lblleito = (TextView)findViewById(R.id.lbl_leito);
                lblpressao = (TextView)findViewById(R.id.lbl_pressao);
                lblbatimentos = (TextView)findViewById(R.id.lbl_batimentos);
                lbltemperatura = (TextView)findViewById(R.id.lbl_temperatura);

                lblnome.setText(nome);
                lblleito.setText(String.valueOf(leito));
                lblpressao.setText(String.valueOf(pressao));
                lblbatimentos.setText(String.valueOf(batimentos));
                lbltemperatura.setText(String.valueOf(temperatura));

            }
        }

    }

    public void voltar(View view){
        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }

}
