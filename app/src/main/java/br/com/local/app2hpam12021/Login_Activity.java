//Pacotes
package br.com.local.app2hpam12021;
//Bibliotecas
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //vai executar o layout - login_layout
        setContentView(R.layout.login_layout);
    }

    public void entrarJanelaPrincipal(View view) {
        //Mostra uma mensagem para o usuário
       // Toast.makeText(getApplicationContext(),
         //       "Cliquei em entrar!!!",Toast.LENGTH_LONG).show();
        //Abrir a janela de menu principal
        Intent abrirJanela = new Intent(getApplicationContext(),Principal_Activity.class);
        startActivity(abrirJanela);
        //Fechando a janela de Login
        finish();

    }


}