package com.example.trombi;

import android.graphics.Color;

public class Person {
    String nom;
    String prenom;

    public int getAvatar() {
        return avatar;
    }

    int avatar = Color.BLACK;




public  Person (String nom, String prenom){
    this.prenom = prenom;
    this.nom = nom ;
        }

        public String getNom ()
        {return nom;}



public String getPrenom ()
        {return prenom;}


}