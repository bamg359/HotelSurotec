package repositorio;

import modelo.dominio.Booking;
import modelo.dominio.Habitacion;
import modelo.dominio.Huesped;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class BookingRepositorio {

    Conexion conexion= new Conexion();

    public void reservarDB(Booking reserva, Huesped huesped , Habitacion habitacion){

        PreparedStatement ps = null;

        try(Connection connection = conexion.connect()) {

            String query = "INSERT INTO reserva(fecha_ingreso , fecha_salida , huesped , habitacion , total , forma_pago, estado)VALUES(?,?,?,?,?,?,?)";

            ps = connection.prepareStatement(query);
            ps.setDate(1, Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(2, Date.valueOf(reserva.getFechaSalida()));
            ps.setInt(3, huesped.getId());
            ps.setInt(4, habitacion.getIdHab());
            ps.setDouble(5, reserva.getTotal());
            ps.setString(6, reserva.getFormaPago());
            ps.setString(7, reserva.getEstado());
            ps.executeUpdate();
            System.out.println("Reserva registrada con exito");


        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }


    }






    public void cancelarReservaDB(){

    }

    public void modificarReservaDB(){

    }

    public void listarReservasDB(){

    }

    public void buscarReservaDB(){

    }



}
