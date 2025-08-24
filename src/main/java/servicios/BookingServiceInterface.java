package servicios;

import modelo.dominio.Habitacion;
import modelo.dominio.Huesped;

public interface BookingServiceInterface {


    public void reservar(Huesped huesped, Habitacion habitacion);
    public void cancelarReserva(int idReserva);
    public void modificarReserva(int idReserva, Habitacion nuevaHabitacion);
    public void verDisponibilidad(Habitacion habitacion);
    public void listarReservas();
    public void buscarReservaPorHuesped(int idHuesped);
    public void buscarReservaPorFecha(String fecha);




}
