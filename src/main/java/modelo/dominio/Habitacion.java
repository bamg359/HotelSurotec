package modelo.dominio;

public class Habitacion {


    private int idHab;
    private String numHabitacion;
    private double precio;
    private String disponible;
    private TipoHabitacion tipoHabitacion;

    public Habitacion() {
    }

    public Habitacion(int idHab, String numHabitacion, double precio, String disponible, TipoHabitacion tipoHabitacion) {
        this.idHab = idHab;
        this.numHabitacion = numHabitacion;
        this.precio = precio;
        this.disponible = disponible;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getIdHab() {
        return idHab;
    }

    public void setIdHab(int idHab) {
        this.idHab = idHab;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }


    @Override
    public String toString() {
        return "Habitacion{" +
                "idHab=" + idHab +
                ", numHabitacion='" + numHabitacion + '\'' +
                ", precio=" + precio +
                ", disponible='" + disponible + '\'' +
                ", tipoHabitacion=" + tipoHabitacion +
                '}';
    }
}





