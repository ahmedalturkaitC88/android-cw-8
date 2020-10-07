package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        POKEMON Charizard = new POKEMON("Charizard",R.drawable.charizard,84,78,534);
        POKEMON sqirtle = new POKEMON("sqirtle",R.drawable.squirtle,48,65,314);
        POKEMON blastoise = new POKEMON("blastoise",R.drawable.blastoise,83,100,530);
        POKEMON Venusaur = new POKEMON("Venusaur",R.drawable.venu,82,83,525);


        ArrayList<POKEMON> POKEBALL = new ArrayList<>();

       POKEBALL.add(Charizard);
        POKEBALL.add(sqirtle);
        POKEBALL.add(blastoise);
        POKEBALL.add(Venusaur);

        RecyclerView rv = findViewById(R.id.recycle);


        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        pokemonAdapter pa = new pokemonAdapter(POKEBALL,this);
        rv.setAdapter(pa);




    }
}