package com.example.pager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab; //declarar
    ViewPager2 pager; //declarar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tab= findViewById(R.id.tab); //inicializar (vincular xml com java)
        pager = findViewById(R.id.pager); //inicializar (vincular xml com java)
        //tab= guia, aba
        //pager = página, conteúdo dos fragmentos criados

        FragmentManager fm = getSupportFragmentManager(); //chamando gerente
        Adaptador adaptador = new Adaptador (fm, getLifecycle()); //criou adaptador, usando-o
        //adaptador fala para qual fragmento o pager vai e dá as posições

        pager.setAdapter(adaptador); //alterar adaptador no pager
        tab.addTab(tab.newTab().setText("Primeiro")); //adicionar tab e mudar texto para primeiro
        tab.addTab(tab.newTab().setText("Segundo"));
        tab.addTab(tab.newTab().setText("Terceiro"));

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            ; //comand para dar função pra tab

            @Override
            public void onTabSelected(TabLayout.Tab tab) { //selecionar guia
                pager.setCurrentItem(tab.getPosition()); //deixar a tab na mesma posição que o pager
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {//deselecionar guia

            }

        });
        pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { //comando para dar função ao pager
            @Override
            public void onPageSelected(int position) { //ao selecionar pager muda posição
                super.onPageSelected(position);
                tab.selectedTab(tab.getTabAt(position)); //mudar tab quando mudar pager
            }
        });
    }
