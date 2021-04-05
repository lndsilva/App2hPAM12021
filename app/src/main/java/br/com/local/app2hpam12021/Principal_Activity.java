package br.com.local.app2hpam12021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Principal_Activity extends AppCompatActivity {
    //Declarar os componentes que irei acessar pelo id do xml. Vão ser componentes globais
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_layout);

        //Realizar a ligação do componente que está no Java
        // com o componente que está no xml
        btnVoltar = findViewById(R.id.btnVoltar);
        //Executando uma ação de clique
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Voltar para janela de login, abrindo essa janela
                startActivity(new Intent(getApplicationContext(),
                        Login_Activity.class));
                //fechando a janela de menu
                finish();
            }
        });

    }
}