package servicios;

import modelo.dominio.Habitacion;
import modelo.dominio.TipoHabitacion;
import repositorio.HabitacionRepositorio;
import util.HabitacionEstadoUtil;

import java.util.Scanner;

public class HabitacionServiceImpl implements HabitacionServiceInterface {

    Scanner sc = new Scanner(System.in);

    private final HabitacionRepositorio habitacionRepositorio;

    public HabitacionServiceImpl(HabitacionRepositorio habitacionRepositorio) {
        this.habitacionRepositorio = habitacionRepositorio;

    }


    @Override
    public void crearHabitacion(Habitacion habitacion, TipoHabitacion tipoHabitacion) {

        System.out.println(" Ingrese el numero de habitacion: ");
        String numHab = sc.nextLine();
        habitacion.setNumHabitacion(numHab);

        System.out.println(" Ingrese el Precio de la habitacion: ");
        double precioHab = sc.nextDouble();
        habitacion.setPrecio(precioHab);

        System.out.println(" Ingrese el estado de la habitacion: 1.Disponible 2.Ocupada ");

        String estadoHab = HabitacionEstadoUtil.asignarEstadoHabitacion();

        habitacion.setDisponible(estadoHab);

        System.out.println(" Ingrese el ID del tipo de habitacion: ");

        TipoHabitacion tipoHab = new TipoHabitacion();

        tipoHabitacion.getIdTipoHabitacion();

        int idTipoHab = tipoHabitacion.getIdTipoHabitacion();

        //habitacion.setTipoHabitacion(idTipoHab);

        habitacionRepositorio.crearHabitacionDB(habitacion);

    }

    @Override
    public void modificarHabitacion(Habitacion habitacion) {

    }

    @Override
    public void eliminarHabitacion(int idHab) {

    }

    @Override
    public void buscarHabitacion(int idHab) {

    }

    @Override
    public void listarHabitaciones() {
        habitacionRepositorio.verHabitaciones();
    }
}
