package com.example.looogin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class Etudiant_fptAdapter extends ArrayAdapter<String> {
    Context context;
    int[] images;
    String[] nomEtudiant;
    String[] cne;
    String[] heure;


    public Etudiant_fptAdapter(Context context, String[] nomEtudiant, int[] images, String[] cne_Etudiant,String[] heure_Etudiant) {
        super(context, R.layout.etudiant_item, R.id.textView1, nomEtudiant);
        this.context = context;
        this.images = images;
        this.nomEtudiant = nomEtudiant;
        this.cne = cne_Etudiant;
        this.heure = heure_Etudiant;

    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View singleItem = convertView;

        com.example.looogin.EtudiantView holder = null;

        if(singleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.etudiant_item, parent, false);


            holder = new com.example.looogin.EtudiantView(singleItem);

            singleItem.setTag(holder);
        }

        else{

            holder = (com.example.looogin.EtudiantView) singleItem.getTag();
        }

        holder.itemImage.setImageResource(images[position]);
        holder.nomEtudiant.setText(nomEtudiant[position]);
        holder.cneEtudiant.setText(cne[position]);

        return singleItem;
    }


}
