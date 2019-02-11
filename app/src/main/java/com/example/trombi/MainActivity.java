package com.example.trombi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_trombi;
    Button btn_addPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_trombi = (Button) findViewById(R.id.btn_trombi);
        btn_trombi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bienvenue au trombinoscope",Toast.LENGTH_LONG).show();
                Intent monIntent = new Intent(MainActivity.this, SheetTrombi.class);
                MainActivity.this.startActivity(monIntent);

            }
        });
        btn_addPerson = (Button) findViewById(R.id.btn_addPerson);
        btn_addPerson.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent monIntent = new Intent(MainActivity.this, SheetAjout.class);
                MainActivity.this.startActivity(monIntent);
            }
        });
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}


