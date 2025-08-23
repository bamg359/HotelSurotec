package repositorio;

import modelo.dominio.Huesped;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HuespedRepositorio {

    Conexion conexion = new Conexion();
    Scanner sc = new Scanner(System.in);

    List<ArrayList<String>>  listaHuespedes = new ArrayList<>();

    // DAO = Data Access Object

    public void crearHuespedRepositorio(Huesped huesped) {

        ArrayList<String> listaHuesped = new ArrayList<>();


        String id = String.valueOf(huesped.getId());
        String nombre = huesped.getNombre();
        String apellido = huesped.getApellido();
        String telefono = huesped.getTelefono();
        String direccion = huesped.getDireccion();
        String ocupacion = huesped.getOcupacion();
        String origen = huesped.getOrigen();
        String tipoHuesped = huesped.getTipoHuesped();


        listaHuesped.add(id);
        listaHuesped.add(nombre);
        listaHuesped.add(apellido);
        listaHuesped.add(telefono);
        listaHuesped.add(direccion);
        listaHuesped.add(ocupacion);
        listaHuesped.add(origen);
        listaHuesped.add(tipoHuesped);

        // En la listaHuespedes se guarda una lista de strings que representa un huesped
        listaHuespedes.add(listaHuesped);


        System.out.println("Huesped registrado: " + listaHuesped);

    }

    public void crearHuespedDB(Huesped huesped) {

        PreparedStatement ps = null;

        try(Connection connection = conexion.connect()) {

            String query = "INSERT INTO huesped(id_huesped, nombre_huesped, apellido, telefono, direccion, ocupacion, origen,tipoHuesped)VALUES(?,?,?,?,?,?,?,?)";

            ps = connection.prepareStatement(query);
            ps.setInt(1, huesped.getId());
            ps.setString(2, huesped.getNombre());
            ps.setString(3, huesped.getApellido());
            ps.setString(4, huesped.getTelefono());
            ps.setString(5, huesped.getDireccion());
            ps.setString(6, huesped.getOcupacion());
            ps.setString(7, huesped.getOrigen());
            ps.setString(8, huesped.getTipoHuesped());

            ps.executeUpdate();

            System.out.println("Huesped registrado en la base de datos: " + huesped.getNombre() + " " + huesped.getApellido());

        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }


    }

    public void verHuespedes(){

        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection connection = conexion.connect()) {

            String query = "SELECT * FROM huesped";

            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()){

                int id = rs.getInt("id_huesped");
                String nombre = rs.getString("nombre_huesped");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String ocupacion = rs.getString("ocupacion");
                String origen = rs.getString("origen");
                String tipoHuesped = rs.getString("tipoHuesped");

                System.out.println("Huesped{id=" + id +
                        ", nombre='" + nombre + '\'' +
                        ", apellido='" + apellido + '\'' +
                        ", telefono='" + telefono + '\'' +
                        ", direccion='" + direccion + '\'' +
                        ", ocupacion='" + ocupacion + '\'' +
                        ", origen='" + origen + '\'' +
                        ", tipoHuesped='" + tipoHuesped + '\'' +
                        '}');

            }


        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }

    }


    public void buscarHuespedPorIdBD(int id){

        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection connection = conexion.connect()) {

            String query = "SELECT * FROM huesped WHERE id_huesped = ?";

            ps = connection.prepareStatement(query);

            ps.setInt(1,id);

            rs = ps.executeQuery();

            while(rs.next()){

                int id_huesped = rs.getInt("id_huesped");
                String nombre = rs.getString("nombre_huesped");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String ocupacion = rs.getString("ocupacion");
                String origen = rs.getString("origen");
                String tipoHuesped = rs.getString("tipoHuesped");

                System.out.println("Huesped{id=" + id_huesped +
                        ", nombre='" + nombre + '\'' +
                        ", apellido='" + apellido + '\'' +
                        ", telefono='" + telefono + '\'' +
                        ", direccion='" + direccion + '\'' +
                        ", ocupacion='" + ocupacion + '\'' +
                        ", origen='" + origen + '\'' +
                        ", tipoHuesped='" + tipoHuesped + '\'' +
                        '}');





            }



        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }


    public void actualizarHuespedBD(Huesped huesped){

        System.out.println("apellido: " + huesped.getApellido());
        System.out.println("Id"+ huesped.getId());


        PreparedStatement ps = null;

        try(Connection connection = conexion.connect()) {

            if(huesped.getNombre() != null && !huesped.getNombre().isEmpty()){
                String query = createQueryUpdateHuesped(" nombre_huesped");
                ps = connection.prepareStatement(query);
                ps.setString(1,huesped.getNombre());
                ps.setInt(2,huesped.getId());
                ps.executeUpdate();
                System.out.println("Huesped actualizado en la base de datos: " + huesped.getNombre() + " " + huesped.getApellido());


            }else if(huesped.getApellido() != null && !huesped.getApellido().isEmpty()){
                String query = createQueryUpdateHuesped(" apellido");
                ps = connection.prepareStatement(query);
                ps.setString(1,huesped.getApellido());
                ps.setInt(2,huesped.getId());
                ps.executeUpdate();
                System.out.println("Huesped actualizado en la base de datos: " + huesped.getNombre() + " " + huesped.getApellido());
            } else{
                System.out.println("No se proporcionó un nombre o apellido válido para actualizar.");
            }






        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }


    public void eliminarHuespedBD(int id){

        PreparedStatement ps = null;

        try(Connection connection = conexion.connect()) {

            String query = "DELETE FROM huesped WHERE id_huesped = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Huesped eliminado de la base de datos con id: " + id);


        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }



    public String createQueryUpdateHuesped(String paramSQL){
        return "UPDATE huesped SET"+ paramSQL + "= ? WHERE id_huesped = ?";
    }












    public List<ArrayList<String>> getListaHuespedes() {
        return listaHuespedes;
    }


}
