package com.sdc.curso.terremotos;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.Spinner;

/**
 * Created by mañá on 03/02/2015.
 */
public class BusquedaFragment extends Fragment {

    Button btnBuscar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_busqueda, container);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //lvCorreos = (ListView) getActivity().findViewById(R.id.lvCorreos);
        Spinner spinnerCategoria = (Spinner)getActivity().findViewById(R.id.sprCategoria);

        DatePicker dpFecha = (DatePicker)getActivity().findViewById(R.id.datePicker);
        //  CalendarView
        //calFecha = (CalendarView)findViewById(R.id.calendarView);
        //Button
        btnBuscar = (Button)getActivity().findViewById(R.id.btnBuscar);

        /*btnBuscar.setOnClickListener(new View.OnClickListener() {
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
        dpFecha.setCalendarViewShown(false);
    }

    protected void setOnClickListener(View.OnClickListener listener){
        btnBuscar.setOnClickListener(listener);
    }
}
