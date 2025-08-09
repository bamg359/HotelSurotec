package servicios;

import modelo.dominio.Persona;

public interface PersonaInterface {


    public void registrarPersona(Persona persona);

    public void eliminarPersona(int id);

    public Persona buscarPersona(int id);

    public void actualizarPersona(Persona persona);

    public void listarPersonas();




}
