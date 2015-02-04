package com.sdc.curso.terremotos;

import java.io.Serializable;

/**
 * Created by virtual on 03/02/2015.
 */
public class Terremoto implements Serializable {
/*M 1.1 - 78km ENE of Sutton-Alpine, Alaska
martes, 03 de febrero de 2015 18:57
Time
    2015-02-03 17:46:56 UTC
    2015-02-03 08:46:56 -09:00 at epicenter
Location
    62.151°N 147.562°W
Depth
    71.40 km (44.37 mi)*/
    private String ubicacion;
    private String magnitud;
    private String fecha;
    private String coordNorte;
    private String coordOeste;
    private float profundidad;

    public Terremoto(){

    }

    public Terremoto(String ubicacion, String magnitud, String fecha) {
        this.ubicacion = ubicacion;
        this.magnitud = magnitud;
        this.fecha = fecha;
    }

    public Terremoto(String ubicacion, String magnitud, String fecha, String coordNorte, String coordSur, float profundidad) {
        this.ubicacion = ubicacion;
        this.magnitud = magnitud;
        this.fecha = fecha;
        this.coordNorte = coordNorte;
        this.coordOeste = coordSur;
        this.profundidad = profundidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCoordNorte() {
        return coordNorte;
    }

    public void setCoordNorte(String coordNorte) {
        this.coordNorte = coordNorte;
    }

    public String getCoordOeste() {
        return coordOeste;
    }

    public void setCoordOeste(String coordOeste) {
        this.coordOeste = coordOeste;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "Terremoto{" +
                "ubicacion=" + ubicacion +
                ", magnitud=" + magnitud +
                ", fecha='" + fecha + '\'' +
                ", coordNorte='" + coordNorte + '\'' +
                ", coordOeste='" + coordOeste + '\'' +
                ", profundidad=" + profundidad +
                '}';
    }
}
