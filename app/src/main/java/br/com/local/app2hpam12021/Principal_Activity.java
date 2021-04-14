package br.com.local.app2hpam12021;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    //Inserir o menu criado na barra de aplicativo - appBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflar o menu ao layout atual
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //Criando as ações para os itens do menu.
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mCadastrar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em cadastrar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAlterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Excluir",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mPesquisar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mVoltar:
                startActivity(new Intent(getApplicationContext(), Login_Activity.class));
                finish();

        }


        return super.onOptionsItemSelected(item);
    }
}