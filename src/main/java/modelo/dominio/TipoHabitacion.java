package modelo.dominio;

import modelo.casosdeusos.UsoHabitacion;

import java.util.ArrayList;
import java.util.List;

public class TipoHabitacion {


    private int idTipoHabitacion;
    private String descripcion;


    public TipoHabitacion(){

    }

    public TipoHabitacion(int idTipoHabitacion, String descripcion) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.descripcion = descripcion;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }





    List<ArrayList<Habitacion>> habitaciones;



}
