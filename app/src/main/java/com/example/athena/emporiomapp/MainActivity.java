package com.example.athena.emporiomapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastrarLayout(View v){
        Intent intent = new Intent(this,CadastroActivity.class);
        startActivity(intent);
    }

    public void entrar(View v){
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }

}
