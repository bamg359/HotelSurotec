package repositorio;

import modelo.dominio.Huesped;

import java.util.ArrayList;
import java.util.List;

public class HuespedRepositorio {



    List<ArrayList<String>>  listaHuespedes = new ArrayList<>();



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





}
