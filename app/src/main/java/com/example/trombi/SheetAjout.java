package com.example.trombi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SheetAjout extends AppCompatActivity {

    EditText mNom;
    EditText mPrenom;


    private Button btn_add;


    public static ArrayList listeDePersonne = new ArrayList<Person>();
    Person p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet_ajout);

        btn_add = (Button) findViewById(R.id.btn_add);

        btn_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mNom = (EditText) findViewById(R.id.txtNom);
                mPrenom = (EditText) findViewById(R.id.txtPrenom);
                p = new Person(mNom.getText().toString(), mPrenom.getText().toString());
                listeDePersonne.add(p);
                Toast.makeText(getApplicationContext(), "la personne a bien été saisie", Toast.LENGTH_LONG).show();


            }
        });



    }

}
