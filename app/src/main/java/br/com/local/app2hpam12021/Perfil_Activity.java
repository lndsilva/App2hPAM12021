package br.com.local.app2hpam12021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Perfil_Activity extends AppCompatActivity {
    MaterialToolbar toolbar;
    FloatingActionButton idFAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_layout);

        toolbar = findViewById(R.id.idToolBar);
        idFAB = findViewById(R.id.idFAB);

        idFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Adicionado com sucesso!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mCadastrar:
                        Toast.makeText(getApplicationContext(),
                                "Cadastrar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mAlterar:
                        Toast.makeText(getApplicationContext(),
                                "Alterar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mExcluir:
                        Toast.makeText(getApplicationContext(),
                                "Excluir",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mPesquisar:
                        Toast.makeText(getApplicationContext(),
                                "Pesquisar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mVoltar:
                        startActivity(new Intent(getApplicationContext(),
                                Login_Activity.class));
                        finish();
                        break;
                }
                return false;
            }
        });
    }
}