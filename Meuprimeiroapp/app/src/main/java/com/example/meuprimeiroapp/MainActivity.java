package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText campo, login, senha;
    ArrayList<Usuario>listinha = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Primeiro método da ativity a ser executado
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); // Obter o banner com o titulo do app e esconder
        campo = findViewById(R.id.nome); //Vincular variavel do java com o xml
        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);
        criaUsuario();
    }

    public void clicar(View v) { //O parâmetro view torna o método vísivel ao arvquivo xml
        String mensagem = "Olá, " + campo.getText() + ", bora programar Android?";
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();


    }

    public void logar(View v) {
        String user = login.getText().toString();
        String pass = senha.getText().toString();
        String mensagem = "Bem vindo!";
        for(Usuario u:listinha) {
            if (user.equals(u.getLogin()) && pass.equals(u.getSenha())) {
                 if(u.isAdmin()){
                     Intent i = new Intent(this, Admin.class);
                     startActivity(i);
                 }
                 else{
                     Intent i = new Intent(this,Comum.class);
                     startActivity(i);
                 }
                 mensagem = "Bem vindo!";
                 break;
            }
            else{
                mensagem = "login ou senha incorreta!";
            }
        }
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
    }

    private void criaUsuario() {
        Usuario u1 = new Usuario("admin", "admin", true);
        Usuario u2 = new Usuario("jack", "java", true);
        Usuario u3 = new Usuario("pikachu", "123", false);
        Usuario u4 = new Usuario("arvore", "abc", false);
        Usuario u5 = new Usuario("flor", "tatata", false);
        listinha.add(u1);
        listinha.add(u2);
        listinha.add(u3);
        listinha.add(u4);
        listinha.add(u5);
    }
}