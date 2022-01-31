package com.example.looogin;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/*
Android Adapter (L'adaptateur) est un pont entre des View (par exemple comme ListView) et les données sous-jacentes pour ce View. Un Adapter gère des données et adapte les données dans les lignes individuelles (ListItem) du view.
Vous pouvez lier
des Adapter avec Android ListView via
la méthode setAdapter. Maintenant, nous allons voir comment Adapter fonctionne à l'aide de l'image ci-dessous.


 gradle :
 est un outil de constructio de projets comme make et maven
 gradle se sert des fichiers nomme build.gradle pour construire le projet
 il y a 2 build gradle :
 un script build gradle dans le dossier racine du projet il indique quelles sont les dependances generales
 un dossier app contenant l app du projet
 un script build .gradle dans le dossierapp pour compiler l application


 */
import android.content.Intent;


public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second Activity");

        //intent to get data
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");

        //TextView
        TextView mResultTv = findViewById(R.id.resultTv);

        //setText
        mResultTv.setText("Name: "+name+"\nEmail: "+email+ "\nPhone: "+phone);

    }
}


