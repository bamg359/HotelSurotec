package servicios;

import modelo.dominio.Empleado;
import modelo.dominio.Huesped;
import modelo.dominio.Persona;

public interface EmpleadoInterface {


    public void registrarPersona(Empleado empleado);

    public void eliminarPersona(int id);

    public Persona buscarPersona(int id);

    public void actualizarPersona(Empleado empleado);

    public void listarPersonas();

}
