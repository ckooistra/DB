package ca.umontreal.db_test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import org.json.JSONObject;

public class CoordActivity extends AppCompatActivity {

    EditText latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coord);
        latitude = (EditText) findViewById(R.id.latitude);
        longitude = (EditText) findViewById(R.id.longitude);

    }

    public JSONObject getParking(View view){
        String sLatitude = latitude.getText().toString();
        String sLongitude = longitude.getText().toString();

        String type = "coord";

        DB db = new DB(this);
        db.execute(type, sLatitude, sLongitude );
    }

}
