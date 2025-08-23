package servicios;

import modelo.dominio.Huesped;
import modelo.dominio.Persona;
import repositorio.HuespedRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HuespedServiceImpl implements HuespedInterface {

    Scanner sc = new Scanner(System.in);

    HuespedRepositorio huespedRepositorio = new HuespedRepositorio();

    public HuespedServiceImpl(HuespedRepositorio huespedRepositorio) {
        this.huespedRepositorio = huespedRepositorio;
    }


    @Override
    public void registrarPersona(Huesped huesped) {

        System.out.println("Id");
        int id =  sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Nombre");
        String nombre = sc.nextLine();
        System.out.println("Apellido");
        String apellido = sc.nextLine();
        System.out.println("Telefono");
        String telefono = sc.nextLine();
        System.out.println("Direccion");
        String direccion = sc.nextLine();
        System.out.println("Ocupacion");
        String ocupacion = sc.nextLine();
        System.out.println("Origen");
        String origen = sc.nextLine();
        System.out.println("Tipo de Huesped");
        String tipoHuesped = sc.nextLine();


        huesped.setId(id);
        huesped.setNombre(nombre);
        huesped.setApellido(apellido);
        huesped.setTelefono(telefono);
        huesped.setDireccion(direccion);
        huesped.setOcupacion(ocupacion);
        huesped.setOrigen(origen);
        huesped.setTipoHuesped(tipoHuesped);

        huespedRepositorio.crearHuespedRepositorio(huesped);
        huespedRepositorio.crearHuespedDB(huesped);

    }

    @Override
    public void eliminarPersona(int id) {

        huespedRepositorio.eliminarHuespedBD(id);

    }

    @Override
    public void buscarPersona(int id) {

        huespedRepositorio.buscarHuespedPorIdBD(id);

    }

    @Override
    public void actualizarPersona(Huesped huesped) {


        System.out.println("Actualizar Huesped");

        System.out.println("Seleccione el campo a actualizar: 1. Nombre 2. Apellido");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option){

                case 1:
                    System.out.println("Ingrese el nuevo nombre ");
                    String nombre = sc.nextLine();
                    sc.nextLine(); // Consumir el salto de línea pendiente
                    System.out.println("Ingrese el Id del Huesped a actualizar ");
                    int id = sc.nextInt();
                    huesped.setId(id);
                    huesped.setNombre(nombre);
                    huespedRepositorio.actualizarHuespedBD(huesped);
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo apellido ");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese el Id del Huesped a actualizar ");
                    id = sc.nextInt();
                    huesped.setId(id);
                    huesped.setApellido(apellido);
                    huespedRepositorio.actualizarHuespedBD(huesped);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }




    }

    @Override
    public void listarPersonas() {
        List<ArrayList<String>> listaHuesped = huespedRepositorio.getListaHuespedes();

        for (ArrayList<String> huesped : listaHuesped) {
            System.out.println("Huesped{id=" + huesped.get(0) +
                    ", nombre='" + huesped.get(1) + '\'' +
                    ", apellido='" + huesped.get(2) + '\'' +
                    ", telefono='" + huesped.get(3) + '\'' +
                    ", direccion='" + huesped.get(4) + '\'' +
                    ", ocupacion='" + huesped.get(5) + '\'' +
                    ", origen='" + huesped.get(6) + '\'' +
                    ", tipoHuesped='" + huesped.get(7) + '\'' +
                    '}');
        }


    }


    public void mostrarHuespedes(){

        huespedRepositorio.verHuespedes();
    }


}
