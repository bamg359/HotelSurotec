package modelo.dominio;

public class Huesped extends Persona{


    private String ocupacion;
    private String origen;
    private String tipoHuesped;


    public Huesped() {
        super();
    }


    public Huesped(int id, String nombre, String apellido, String telefono, String direccion, String ocupacion, String origen, String tipoHuesped) {
        super(id, nombre, apellido, telefono, direccion);
        this.ocupacion = ocupacion;
        this.origen = origen;
        this.tipoHuesped = tipoHuesped;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTipoHuesped() {
        return tipoHuesped;
    }

    public void setTipoHuesped(String tipoHuesped) {
        this.tipoHuesped = tipoHuesped;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Huesped{" +
                "ocupacion='" + ocupacion + '\'' +
                ", origen='" + origen + '\'' +
                ", tipoHuesped='" + tipoHuesped + '\'' +
                '}';
    }



}
