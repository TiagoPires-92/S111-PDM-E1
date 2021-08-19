package com.example.pdm_e1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abreSegundaActivity(View view) {
        EditText campoLogin = findViewById(R.id.editText_Login);
        EditText campoSenha = findViewById(R.id.editText_Password);
        String loginDigitado = campoLogin.getText().toString();
        String senhaDigitada = campoSenha.getText().toString();
        if(loginDigitado.equals("admin") && senhaDigitada.equals("123")){
            Bundle sacolaParametros = new Bundle();
            sacolaParametros.putString("TEXTO_LOGIN",loginDigitado);
            sacolaParametros.putString("TEXTO_SENHA",senhaDigitada);
            Intent intent = new Intent(this,InformacoesActivity.class);
            intent.putExtras(sacolaParametros);
            startActivity(intent);
        }else{
            Toast toast = Toast.makeText(this, "Login ou Senha incorreta!" , Toast.LENGTH_LONG);
            toast.show();
        }
    }
}