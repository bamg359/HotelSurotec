package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {


    public Connection connect(){

        Connection connection = null;

        try{


            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsurotecdb", "root", "");
            if (connection != null){
                System.out.println("Conexión exitosa a la base de datos HotelSurotecDB");
            }



        }catch(SQLException e){
            System.out.println("Error de conexión: " + e.getMessage());
        }

        return connection;
    }

}
