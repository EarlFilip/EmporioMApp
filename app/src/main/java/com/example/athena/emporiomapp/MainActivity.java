package com.example.athena.emporiomapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    public void entrar(View v) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}
