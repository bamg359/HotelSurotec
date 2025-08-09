package vista;

import modelo.dominio.Huesped;
import repositorio.HuespedRepositorio;
import servicios.HuespedServiceImpl;

public class Main {


    public static void main(String[] args) {

        Huesped huesped = new Huesped();
        HuespedRepositorio huespedRepositorio = new HuespedRepositorio();
        HuespedServiceImpl huespedService = new HuespedServiceImpl(huespedRepositorio);

        huespedService.registrarPersona(huesped);
        huespedService.registrarPersona(huesped);
        huespedService.listarPersonas();






    }
}
