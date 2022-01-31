package com.example.looogin;


/*
adaptateur (ou wrapper1) est un patron de conception (design pattern) de type structure (structural). Il permet de convertir l'interface d'une classe en une autre interface que le client attend.

L’adaptateur fait fonctionner ensemble des classes qui n'auraient pas pu fonctionner sans lui, à cause d'une incompatibilité d'interfaces

ListView est un view group, affiche des éléments (elements) selon une liste et et peut être déplacé verticalement. Listview est une vue importante et est largement utilisé dans les applications Android.
Un simple exemple de ListView est votre carnet de contacts, où vous avez une liste de vos contacts affichés dans un ListView.

1.1- ListItem
Un ListView est fait à partir d'un groupe de ListItem. ListItem est une ligne (row) individuelle dans listview où les données seront affichées. Toutes les données dans listview sont affichées uniquement via listItem. Considérez Listview comme groupe défilable de ListItems.
Un ListItem est une pièce de l'interface qui peut être créée par un nombre de View.

Modèle-vue-contrôleur ou MVC est un motif d'architecture logicielle destiné aux interfaces graphiques  et très populaire pour les applications web. Le motif est composé de trois types de modules ayant trois responsabilités différentes : les modèles, les vues et les contrôleurs.

Un modèle (Model) contient les données à afficher.
Une vue (View) contient la présentation de l'interface graphique.
Un contrôleur (Controller) contient la logique concernant les actions effectuées par l'utilisateur.

 */





import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");

        //EditText
        final EditText mNameEt = findViewById(R.id.nameEt);
        final EditText mEmailEt = findViewById(R.id.emailEt);
        final EditText mPhoneEt = findViewById(R.id.phoneEt);
        //Button
        Button mSaveBtn = findViewById(R.id.saveBtn);

        //button click listener
        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from edit text
                String name = mNameEt.getText().toString();
                String email = mEmailEt.getText().toString();
                String phone = mPhoneEt.getText().toString();

                //activity intent
                Intent intent = new Intent(MainActivity4.this, com.example.looogin.MainActivity7.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PHONE", phone);
                startActivity(intent);

            }
        });
    }
}