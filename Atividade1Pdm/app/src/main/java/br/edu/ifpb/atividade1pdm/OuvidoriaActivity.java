package br.edu.ifpb.atividade1pdm;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by mathe on 08/03/2018.
 */

public class OuvidoriaActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ouvidoria);
        Button btnCancelar = (Button) findViewById(R.id.btnCancelar);
        Button btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnCancelar.setOnClickListener(onClickCancelar());
        btnEnviar.setOnClickListener(onClickOutro());
    }

    private View.OnClickListener onClickOutro(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert("Em construção!");
            }
        };
    }

    private View.OnClickListener onClickCancelar(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( OuvidoriaActivity.this, MainActivity.class);
                OuvidoriaActivity.this.startActivity(intent);
            }
        };
    }

    private void alert(String mensagem){
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}
