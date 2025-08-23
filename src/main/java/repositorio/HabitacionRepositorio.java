package repositorio;

import modelo.dominio.Habitacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HabitacionRepositorio {

    Conexion conexion = new Conexion();

    public void crearHabitacionDB(Habitacion habitacion){

        PreparedStatement ps = null;

        try(Connection connection = conexion.connect()) {


            String query = "INSERT INTO habitacion(num_habitacion, precio, disponible , tipo_habitacion)VALUES(?,?,?,?)";
            ps= connection.prepareStatement(query);
            ps.setString(1, habitacion.getNumHabitacion());
            ps.setDouble(2,habitacion.getPrecio());
            ps.setString(3,habitacion.getDisponible());
            ps.setInt(4,Integer.parseInt(String.valueOf(habitacion.getTipoHabitacion().getIdTipoHabitacion())));


        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }



    public void verHabitaciones(){

        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection connection = conexion.connect()) {


            String query = "SELECT * FROM habitacion";

            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()){

                int id = rs.getInt("id_habitacion");
                String numHabitacion = rs.getString("num_habitacion");
                double precio = rs.getDouble("precio");
                String disponible = rs.getString("disponible");
                int tipoHabitacion = rs.getInt("tipo_habitacion");

                System.out.println("Habitacion{id=" + id +
                        ", numHabitacion='" + numHabitacion + '\'' +
                        ", precio=" + precio +
                        ", disponible='" + disponible + '\'' +
                        ", tipoHabitacion=" + tipoHabitacion +
                        '}');
            }



        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }


    }






