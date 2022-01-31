package com.example.looogin;



import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EtudiantView {
    ImageView itemImage;
    TextView nomEtudiant;
    TextView cneEtudiant;
    EtudiantView(View v)
    {
        itemImage = v.findViewById(R.id.imageView);
        nomEtudiant = v.findViewById(R.id.textView1);
        cneEtudiant = v.findViewById(R.id.textView2);
    }
}