//Pacotes
package br.com.local.app2hpam12021;
//Bibliotecas

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    EditText edtUsuario, edtSenha;
    TextView txtDesejaCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //vai executar o layout - login_layout
        setContentView(R.layout.login_layout);

        //Apresentar os componentes xml aos objetos no java
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        txtDesejaCadastrar = findViewById(R.id.txtDesejaCadastrar);

        //Criando a ação de clique na TextView Deseja cadastrar
        txtDesejaCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),
                        CadastrarUsuario_Activity.class));
                finish();
            }
        });
    }

    public void entrarJanelaPrincipal(View view) {
        //Mostra uma mensagem para o usuário
        // Toast.makeText(getApplicationContext(),
        //       "Cliquei em entrar!!!",Toast.LENGTH_LONG).show();
        //Abrir a janela de menu principal

        String usuario, senha;

        usuario = edtUsuario.getText().toString();
        senha = edtSenha.getText().toString();

        if (usuario.equals("etecia") && senha.equals("etecia")) {

            Intent abrirJanela = new Intent(getApplicationContext(), Principal_Activity.class);
            startActivity(abrirJanela);
            //Fechando a janela de Login
            finish();
        } else {
            Toast.makeText(getApplicationContext(),
                    "Usuário ou senha inválidos!!!",
                    Toast.LENGTH_SHORT).show();
        }

    }

    public void sairJanelaLogin(View view) {
        finish();
    }


}