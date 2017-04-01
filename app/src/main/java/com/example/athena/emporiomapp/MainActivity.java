package com.example.athena.emporiomapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Usuario usuario;
    EditText editEmail;
    EditText editSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editSenha = (EditText) findViewById(R.id.editSenha);
        usuario = new Usuario();
    }

    public void cadastrarLayout(View v) {

        if (usuario.getSenha().toString() == editSenha.getText().toString()) {
            Intent intent = new Intent(this, CadastroActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this,
                    "Senha Errada.", Toast.LENGTH_SHORT).show();
        }
    }

    public void entrar(View v) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}
