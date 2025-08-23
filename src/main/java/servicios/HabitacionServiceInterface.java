package servicios;

import modelo.dominio.Habitacion;
import modelo.dominio.TipoHabitacion;

public interface HabitacionServiceInterface {


    public void crearHabitacion(Habitacion habitacion, TipoHabitacion tipoHabitacion);
    public void modificarHabitacion(Habitacion habitacion);
    public void eliminarHabitacion(int idHab);
    public void buscarHabitacion(int idHab);
    public void listarHabitaciones();

}
