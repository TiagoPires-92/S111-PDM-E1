package com.example.pdm_e1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.TextView;

public class InformacoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes);

        TextView campoLogin= findViewById(R.id.recebe_usuario);
        TextView campoSenha= findViewById(R.id.recebe_senha);
        campoLogin.setText((String) getIntent().getSerializableExtra("TEXTO_LOGIN"));
        campoSenha.setText((String) getIntent().getSerializableExtra("TEXTO_SENHA"));
    }
}