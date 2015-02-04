package com.sdc.curso.terremotos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class DetalleActivity extends ActionBarActivity {

    private DetalleFragment fragmentDetalle;
    private MapaFragment fragmentMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        fragmentDetalle = (DetalleFragment) getFragmentManager().findFragmentById(R.id.fragmentDetalle);
        fragmentMapa = (MapaFragment) getFragmentManager().findFragmentById(R.id.fragmentMapa);
    }



}