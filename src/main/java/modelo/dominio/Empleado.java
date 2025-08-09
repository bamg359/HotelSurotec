package modelo.dominio;

public class Empleado extends Persona{


    private String cargo;



    public Empleado() {
        super();
    }

    public Empleado(int id, String nombre, String apellido, String telefono, String direccion, String cargo) {
        super(id, nombre, apellido, telefono, direccion);
        this.cargo = cargo;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Empleado{" +
                "cargo='" + cargo + '\'' +
                '}';
    }



}
