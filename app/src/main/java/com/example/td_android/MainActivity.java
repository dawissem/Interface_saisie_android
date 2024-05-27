package com.example.td_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText cin, nomPrenom;
    Spinner spinnerClasse;
    Button valider , afficher;

    TextView listeEtudiant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cin =findViewById(R,Id, cin);
        nomPrenom =findViewById(R,id, nomPrenom);
        spinnerClasse =findViewById(R,id, spinnerClasse);
        valider =findViewById(R,id, valider);
        afficher =findViewById(R,id, afficher);
        listeEtudiant =findViewById(R,id, listeEtudiant);

    }

    ArrayAdapter<String> adapterClasse=new ArrayAdapter<>
            (this,android.R.Layout.simple_spinner_item, getResources().getString(R.array.classe));



}