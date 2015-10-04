package com.dewey.deweyapp.location;



import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.dewey.deweyapp.R;

public class LocationActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_location, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void drawMap(View view){
        System.out.println("Inside Draw Map");
//        Intent intent = getIntent();
//        intent.putExtra("LONGITUDE", ((EditText) findViewById(R.id.edit_longitude)).getText().toString());
//        intent.putExtra("LATITUDE", ((EditText) findViewById(R.id.edit_latitude)).getText().toString());
        FragmentTransaction trans = getFragmentManager().beginTransaction();
        LocationActivityFragment fragment = new LocationActivityFragment();
        trans.add(R.id.loc_fragment, fragment).commit();

    }
}
