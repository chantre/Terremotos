package com.sdc.curso.terremotos;

import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Set;


public class MainActivity extends ActionBarActivity {

    private Button btnBuscar;
    //CalendarView calFecha;
    private BusquedaFragment fragmentBusqueda;
    private ListadoFragment fragmentListado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getFragmentManager().findFragmentById(R.id.fragmentListado);
        fragmentBusqueda = (BusquedaFragment) getFragmentManager().findFragmentById(R.id.fragmentBusqueda);
        fragmentListado = (ListadoFragment) getFragmentManager().findFragmentById(R.id.fragmentListado);
        /*Spinner spinnerCategoria = (Spinner)findViewById(R.id.sprCategoria);

        DatePicker dpFecha = (DatePicker)findViewById(R.id.datePicker);
        //  CalendarView
        //calFecha = (CalendarView)findViewById(R.id.calendarView);
        //Button
        btnBuscar = (Button)findViewById(R.id.btnBuscar);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaActivity.class);

                MainActivity.this.startActivity(intent);
            }
        });*/

        /*//  cargamos el spinner
        //  Creamos el adaptador
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.categorias,android.R.layout.simple_spinner_item);
        //  Añadimos el layout para el menú
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //  Le indicamos al spinner el adaptador a usar
        spinnerCategoria.setAdapter(adapter);*/

        //inicializarCalendar();
        //dpFecha.setCalendarViewShown(false);


        /*************************************************************
         * INICIALIZAR EL VALOR DE LA URL
         */
        /*SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);

        Set<String> stringSet = preferences.getStringSet(R.string.url_pref, getResources().getString(R.string.url_value));*/
    }

    @Override
    protected void onResume() {
        super.onResume();

        fragmentBusqueda.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (fragmentListado != null){
                    //  tablet
                    //fragmentListado.actualizar(item);
                    Toast.makeText(MainActivity.this, "Hola", Toast.LENGTH_SHORT).show();
                    fragmentListado.CargarListado();
                }else{
                    //  smartphone
                    Intent intent = new Intent(MainActivity.this, ListaActivity.class);

                    //intent.putExtra("correo", item);
                    startActivity(intent);
                }
            }
        });

        fragmentListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Terremoto terremoto = (Terremoto) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);

                intent.putExtra("terremoto", terremoto);
                startActivity(intent);
            }
        });
            /*@Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CorreoElectronico item = (CorreoElectronico) parent.getItemAtPosition(position);

                if (fragmentoDetalle != null){
                    //  tablet
                    fragmentoDetalle.actualizar(item);
                }else{
                    //  smartphone
                    Intent intent = new Intent(MainActivity.this, DetalleActivity.class);

                    intent.putExtra("correo", item);
                    startActivity(intent);
                }
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_help) {
            Intent intentHelp = new Intent(MainActivity.this, Ayuda.class);

            MainActivity.this.startActivity(intentHelp);
        }else if (id == R.id.action_settings) {
            Intent intentSettings = new Intent(MainActivity.this, SettingsActivity.class);

            MainActivity.this.startActivity(intentSettings);
        }

        return super.onOptionsItemSelected(item);
    }
}
