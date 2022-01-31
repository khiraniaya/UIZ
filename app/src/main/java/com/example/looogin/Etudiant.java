package com.example.looogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class Etudiant extends AppCompatActivity {

    CircleImageView img;
    TextView name , cin,prenom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etudiant_profiel);

        img=findViewById(R.id.profileimage);
        name=findViewById(R.id.nom);
        cin=findViewById(R.id.cin);
        prenom=findViewById(R.id.prenom);
        Intent intent=getIntent();

        String nom_etudiant=intent.getStringExtra("nom");
        String cin_etudiant=intent.getStringExtra("cin");
        String prenom_etudiant=intent.getStringExtra("prenom");
        int imageid=intent.getIntExtra("image",R.drawable.im2);

        name.setText(nom_etudiant);
        cin.setText(cin_etudiant);
        prenom.setText(prenom_etudiant);
        img.setImageResource(imageid);



    }
}
