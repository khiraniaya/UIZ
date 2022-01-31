package com.example.looogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3  extends AppCompatActivity {


    ListView lvEtudiant;

    String[] cne = {"D1287940", "D12236678", "C904638878", "M98425678", "D109435678", "C00784578", "D23456789", "D088544123", "M09933568", "D87436678"};
    String[] nom = {"Choukri Chaimae", "Aya Khirania", "Zeneb Boutaleb",
            "Rania Amzil ", "Adam Oumchich",
            "Imane Nassiri", " Nihad Yasser", " Fatima Nasser",
            "Hajar Alami  "};
    // Define an integer array to hold the image recourse ids
    int[] programImages = {R.drawable.im7,R.drawable.im2,
            R.drawable.im5, R.drawable.im4, R.drawable.im6,
            R.drawable.im10, R.drawable.im12,R.drawable.im3,
            R.drawable.im9, R.drawable.im8};
    String[] heure= {"8:10","8:10", "8:15",
            "8:19", "8:45",
            "9:00", "8:19", "8:10",
            "8:13"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lvEtudiant = findViewById(R.id.lvEtudiant);

        Etudiant_fptAdapter etudiantAdapter = new Etudiant_fptAdapter(this,nom, programImages, cne,heure);
        lvEtudiant.setAdapter(etudiantAdapter);

        lvEtudiant.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(MainActivity3.this, Etudiant.class);
                    startActivity(myIntent);

                }

            }

        });
    }
}