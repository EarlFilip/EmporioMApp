package com.example.athena.emporiomapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadastroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void voltar(View v) {
        Intent intentv = new Intent(this, MainActivity.class);
        startActivity(intentv);
    }
}
