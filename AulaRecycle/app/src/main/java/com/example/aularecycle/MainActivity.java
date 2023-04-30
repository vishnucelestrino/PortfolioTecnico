package com.example.aularecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Produto> listaProdutos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        cadastroInicial();

    }
    public void cadastroInicial(){
        Produto p1 = new Produto("Arroz", "Alimento",(float)3.99);
        Produto p2 = new Produto("Feijão", "Alimento",(float)3.99);
        Produto p3 = new Produto("Batata", "Alimento",(float)1.99);
        Produto p4 = new Produto("Macarrão", "Alimento",(float)3.99);
        Produto p5 = new Produto("Chocolate", "Alimento",(float)4.99);
        Produto p6 = new Produto("Morango", "Alimento",(float)2.99); //hardcode
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);
        listaProdutos.add(p5);
        listaProdutos.add(p6);
    }
}