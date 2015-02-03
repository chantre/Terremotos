package com.sdc.curso.terremotos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.Spinner;

import java.util.Set;


public class MainActivity extends ActionBarActivity {

    public static final int REQUEST_CODE_SEC_CON_RES = 0;
    Button btnBuscar, btnSecundaria;
    CalendarView calFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinnerCategoria = (Spinner)findViewById(R.id.sprCategoria);

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
        });

        /*//  cargamos el spinner
        //  Creamos el adaptador
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.categorias,android.R.layout.simple_spinner_item);
        //  Añadimos el layout para el menú
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //  Le indicamos al spinner el adaptador a usar
        spinnerCategoria.setAdapter(adapter);*/

        //inicializarCalendar();
        dpFecha.setCalendarViewShown(false);


        /*************************************************************
         * INICIALIZAR EL VALOR DE LA URL
         */
        /*SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);

        Set<String> stringSet = preferences.getStringSet(R.string.url_pref, getResources().getString(R.string.url_value));*/
    }

    /*public void inicializarCalendar() {
        calFecha = (CalendarView) findViewById(R.id.calendarView);

        // sets whether to show the week number.
        calFecha.setShowWeekNumber(false);

        // sets the first day of week according to Calendar.
        // here we set Monday as the first day of the Calendar
        calFecha.setFirstDayOfWeek(2);

        //The background color for the selected week.
        *//*calFecha.setSelectedWeekBackgroundColor(getResources().getColor(R.color.material_blue_grey_800));

        //sets the color for the dates of an unfocused month.
        calFecha.setUnfocusedMonthDateColor(getResources().getColor(R.color.switch_thumb_normal_material_dark));

        //sets the color for the separator line between weeks.
        calFecha.setWeekSeparatorLineColor(getResources().getColor(R.color.switch_thumb_normal_material_dark));

        //sets the color for the vertical bar shown at the beginning and at the end of the selected date.
        calFecha.setSelectedDateVerticalBar(R.color.switch_thumb_normal_material_light);*//*

        //sets the listener to be notified upon selected date change.
        calFecha.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            //show the selected date as a toast
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
                Toast.makeText(getApplicationContext(), day + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
            }
        });
    }*/


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

    /*public void abrirSecundaria(View view) {
        Intent intent = new Intent(this, ConResultadoActivity.class);

        this.startActivityForResult(intent, REQUEST_CODE_SEC_CON_RES);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_SEC_CON_RES){
            if(resultCode ==  Activity.RESULT_OK) {
                //btnSecundaria.setText(data.getStringExtra("dato"));

                Toast.makeText(this, data.getStringExtra("dato"), Toast.LENGTH_LONG).show();
            }
        }
    }*/
}
