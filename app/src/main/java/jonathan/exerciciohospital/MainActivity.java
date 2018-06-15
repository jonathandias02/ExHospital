package jonathan.exerciciohospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EnviarDados(View view){

        EditText nome, leito, pressao, batimentos, temperatura;

        nome = (EditText)findViewById(R.id.edt_nome);
        leito = (EditText)findViewById(R.id.edt_leito);
        pressao = (EditText)findViewById(R.id.edt_pressao);
        batimentos = (EditText)findViewById(R.id.edt_batimentos);
        temperatura = (EditText)findViewById(R.id.edt_temperatura);

        Bundle reg = new Bundle();
        reg.putString("nome", nome.getText().toString());
        reg.putString("leito", leito.getText().toString());
        reg.putString("pressao", pressao.getText().toString());
        reg.putString("batimentos", batimentos.getText().toString());
        reg.putString("temperatura", temperatura.getText().toString());

       if(reg.getString("nome").equals("") || reg.getString("leito").equals("")
               || reg.getString("pressao").equals("") || reg.getString("batimentos").equals("")
               || reg.getString("temperatura").equals("")){
          Toast.makeText(this, "Todos os Campos Precisão ser Preenchidos!", Toast.LENGTH_LONG).show();
        }else {
           Toast.makeText(this, "Cadastrado Com Sucesso!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Registro.class);
        intent.putExtras(reg);
        startActivity(intent);
        }
    }

}
