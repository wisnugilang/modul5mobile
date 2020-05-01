package com.example.wisnu;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Sma1 = new LatLng(-5.1412853,105.4995761);
        mMap.addMarker(new MarkerOptions().position(Sma1).title("Sma N 1 Sekampung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sma1));

        LatLng Ma = new LatLng(-5.1270042,105.4382479);
        mMap.addMarker(new MarkerOptions().position(Ma).title("Ma Ma'arif Nu 5"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ma));

        LatLng Smk = new LatLng(-5.135084,105.4281276);
        mMap.addMarker(new MarkerOptions().position(Smk).title("Smk Muhammadiyah Sekampung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Smk));
    }
}
