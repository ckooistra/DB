package ca.umontreal.db_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.login);
        pass = (EditText) findViewById(R.id.pass);
    }

    public void onLogin(View view){
        String userName = user.getText().toString();
        String passWord = pass.getText().toString();

        String type = "login";

        DB db = new DB(this);
        db.execute(type, userName, passWord);

    }

    public void openReg(View view){
        startActivity(new Intent(this, RegActivity.class));
    }

    public void goToCoord(View view){
        startActivity(new Intent(this, CoordActivity.class));
    }
}
