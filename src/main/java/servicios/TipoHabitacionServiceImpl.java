package servicios;

import modelo.dominio.TipoHabitacion;
import repositorio.TipoHabitacionRepositorio;
import util.TipoHabitacionUtil;

public class TipoHabitacionServiceImpl implements TipoHabitacionServiceInterface {

    private final TipoHabitacionRepositorio tipoHabitacionRepositorio;

    public TipoHabitacionServiceImpl(TipoHabitacionRepositorio tipoHabitacionRepositorio) {
        this.tipoHabitacionRepositorio = tipoHabitacionRepositorio;

    }

    @Override
    public void crearTipoHab(TipoHabitacion tipoHabitacion) {

        //System.out.println(" Seleccione el tipo de habitacion:1. Clasica 2. Premium 3. Suite");

        String tipoHab = TipoHabitacionUtil.asignarTipoHabitacion();

        tipoHabitacion.setDescripcion(tipoHab);

        tipoHabitacionRepositorio.crearTipoHabBD(tipoHabitacion);
    }

    @Override
    public void listarTipoHab() {

    }
}
