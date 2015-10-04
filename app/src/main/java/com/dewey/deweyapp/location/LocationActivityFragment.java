package com.dewey.deweyapp.location;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.dewey.deweyapp.R;

import org.w3c.dom.Text;

/**
 * A placeholder fragment containing a simple view.
 */
public  class LocationActivityFragment extends android.app.Fragment {

    public LocationActivityFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Activity activity = getActivity();
        String longitude;
        String latitude;
        if( activity.findViewById(R.id.edit_longitude) != null) {
            longitude = ((EditText) activity.findViewById(R.id.edit_longitude)).getText().toString();
            latitude = ((EditText) activity.findViewById(R.id.edit_latitude)).getText().toString();
            View view = getView();
            TextView textv = new TextView(getActivity());
            textv.setText( latitude + "     " + longitude);
            container.addView(textv);
        }
        return inflater.inflate(R.layout.fragment_location, container, false);
    }

}
