package repositorio;

import modelo.dominio.TipoHabitacion;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TipoHabitacionRepositorio {

    Conexion conexion = new Conexion();

    public void crearTipoHabBD(TipoHabitacion tipoHabitacion){

        PreparedStatement ps = null;

        try(Connection connection = conexion.connect()) {

            String query = "INSERT INTO tipo_habitacion(descripcion)VALUES(?)";

            ps = connection.prepareStatement(query);
            ps.setString(1, tipoHabitacion.getDescripcion());
            ps.executeUpdate();
            System.out.println("Tipo de habitacion registrado en BD: " + tipoHabitacion.getDescripcion());


        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }




    }


    public void mostrarTipoHabBD(){






    }










}
