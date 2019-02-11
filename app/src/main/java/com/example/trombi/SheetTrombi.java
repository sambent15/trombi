package com.example.trombi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import static com.example.trombi.SheetAjout.listeDePersonne;

public class SheetTrombi extends AppCompatActivity {

    ListView liste1;
    PersonAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet_trombi);

        liste1 = (ListView) findViewById(R.id.list_item);
        adapter = new PersonAdapter(SheetTrombi.this, listeDePersonne);
        liste1.setAdapter(adapter);

    }


}
