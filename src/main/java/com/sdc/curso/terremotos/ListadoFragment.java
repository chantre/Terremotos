package com.sdc.curso.terremotos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mañá on 03/02/2015.
 */
public class ListadoFragment extends Fragment {

    private ListView lvTerremotos;
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listado, container);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //getActivity().setTitle(R.string.title_activity_lista);

        /*
        List<Terremoto> terremotos = Arrays.asList(
                new Terremoto("78km ENE of Sutton-Alpine, Alaska", 1.2f, "2015-02-03",
                        "62.151", "147.562", 71.4f),
                new Terremoto("85km NE of Sutton-Alpine, Yellowstone", 2.2f, "2015-02-03",
                        "62.151", "147.562", 12.4f),
                new Terremoto("34 km E of Kansas, Kansas", 7.2f, "2015-02-03",
                        "62.151", "147.562", 7.4f),
                new Terremoto("7km EN of Vigo, Spain", 8.3f, "2015-02-03",
                        "62.151", "147.562", 71.4f),
                new Terremoto("45km NW of Anchorage, Alaska", 5.5f, "2015-02-03",
                        "62.151", "147.562", 71.4f),
                new Terremoto("78km ENE of Sutton-Alpine, Alaska", 1.2f, "2015-02-03",
                        "62.151", "147.562", 71.4f),
                new Terremoto("78km ENE of Sutton-Alpine, Alaska", 1.2f, "2015-02-03",
                        "62.151", "147.562", 71.4f));*/
        cargarListado();

        /*lvCorreos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //  Ahora comprobamos si estamos con tablet o smartphone
                //  viendo si el fragment de detalle está presente en la activity
                //  pero esto no lo puede gestionar el fragment
            }
        });*/
    }

    public void cargarListado() {
        List<Terremoto> terremotos = Arrays.asList(
                new Terremoto("78km ENE of Sutton-Alpine, Alaska", "1.2", "2015-02-03"),
                new Terremoto("85km NE of Sutton-Alpine, Yellowstone", "2.2", "2015-02-03"),
                new Terremoto("34 km E of Kansas, Kansas", "7.2", "2015-02-03"),
                new Terremoto("7km EN of Vigo, Spain", "8.3", "2015-02-03"),
                new Terremoto("45km NW of Anchorage, Alaska", "5.5", "2015-02-03"),
                new Terremoto("78km ENE of Sutton-Alpine, Alaska", "1.2", "2015-02-03"),
                new Terremoto("78km ENE of Sutton-Alpine, Alaska", "1.2", "2015-02-03"));

        lvTerremotos = (ListView) getActivity().findViewById(R.id.lvTerremotos);

        //  obtenemos el adapter
        ArrayAdapter<Terremoto> adapter = new ArrayAdapter<Terremoto>(getActivity(),
                android.R.layout.simple_list_item_1, terremotos);

        lvTerremotos.setAdapter(adapter);
    }

    //  para poder permitir la inyección de dependencias desde la activity
    public void setOnItemClickListener(AdapterView.OnItemClickListener listener){
        lvTerremotos.setOnItemClickListener(listener);
    }
}