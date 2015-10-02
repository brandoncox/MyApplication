package com.dewey.deweyapp.location;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dewey.deweyapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class LocationActivityFragment extends Fragment {

    public LocationActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_location, container, false);
    }
}
