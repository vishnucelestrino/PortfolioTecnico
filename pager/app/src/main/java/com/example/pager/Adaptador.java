package com.example.pager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;

public class Adaptador extends FragmentStateAdapter {


    public Adaptador(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle); //fragmentManager = gerente
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) { //switch = escolha
            case 1: //caso seja 1
                return new Segundo();
            case 2: //caso seja 2
                return new Terceiro;
        }
        //diferença de switch e if, switch usa menos processamento
        return new Primeiro(); //retorne primeiro
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}