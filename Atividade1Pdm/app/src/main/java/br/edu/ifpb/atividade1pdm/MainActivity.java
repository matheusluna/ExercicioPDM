package br.edu.ifpb.atividade1pdm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnOuvidoria = (ImageButton) findViewById(R.id.btnChat);
        ImageButton btnNotification = (ImageButton) findViewById(R.id.btnNotification);
        ImageButton btnDateRange = (ImageButton) findViewById(R.id.btnDateRange);
        ImageButton btnViewModule = (ImageButton) findViewById(R.id.btnViewModule);
        btnOuvidoria.setOnClickListener(onClickOuvidoria());
        btnNotification.setOnClickListener(onClickOutro());
        btnDateRange.setOnClickListener(onClickOutro());
        btnViewModule.setOnClickListener(onClickOutro());
    }
    private View.OnClickListener onClickOutro(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert("Em construção!");
            }
        };
    }
    private View.OnClickListener onClickOuvidoria(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, OuvidoriaActivity.class);
                MainActivity.this.startActivity(intent);
            }
        };
    }

    private Context getContext(){
        return this;
    }
    private void alert(String mensagem){
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}
