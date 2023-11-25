import java.util.Hashtable;

import utilidades.Fecha;

public class ConvocatoriaJerarquico extends Convocatoria {
    private int annosMinimosEnEmpresa;

    public ConvocatoriaJerarquico(
        int codigo,
        Puesto puesto,
        Fecha fecha,
        int cantEmpleadosRequeridos,
        int annosMinimosEnEmpresa,
        Hashtable<Habilidad,Integer> requisitos
    ) {
        super(codigo, puesto, fecha, cantEmpleadosRequeridos, requisitos);
        this.annosMinimosEnEmpresa = annosMinimosEnEmpresa;
    }

    public boolean empleadoPuedeInscribirse(Empleado empleadoInscribir) {
        //REVISAR
        return super.empleadoPuedeInscribirse(empleadoInscribir) && annosMinimosEnEmpresa <= empleadoInscribir.getAnnosEnEmpresa();
    }
}
