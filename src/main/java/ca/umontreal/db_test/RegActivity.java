package ca.umontreal.db_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegActivity extends AppCompatActivity {

    EditText nom, prenom, courriel, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        courriel = (EditText) findViewById(R.id.courriel);
        pass = (EditText) findViewById(R.id.motPasse1);

    }

    public void onRegister(View view){

        String sNom = nom.getText().toString();
        String sPrenom = prenom.getText().toString();
        String sCourriel = courriel.getText().toString();
        String sPass = pass.getText().toString();

        String type = "register";

        DB db = new DB(this);
        db.execute(type, sNom, sPrenom, sCourriel, sPass);

    }
}
