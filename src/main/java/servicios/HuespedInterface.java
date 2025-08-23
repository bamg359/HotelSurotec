package servicios;

import modelo.dominio.Huesped;
import modelo.dominio.Persona;

public interface HuespedInterface {


    public void registrarPersona(Huesped huesped);

    public void eliminarPersona(int id);

    public void buscarPersona(int id);

    public void actualizarPersona(Huesped huesped);

    public void listarPersonas();




}
