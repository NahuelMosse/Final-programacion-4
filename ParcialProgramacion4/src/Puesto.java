import java.util.ArrayList;

public abstract class Puesto {
    private String nombre;
    private float sueldo;
    private ArrayList<Convocatoria>convocatorias;
    private ArrayList<Empleado>empleados;

    public Puesto(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.convocatorias = new ArrayList<Convocatoria>();
        this.empleados = new ArrayList<Empleado>();
    }
  
    public boolean hasNombre(String nombre) {
        return this.nombre.equalsIgnoreCase(nombre);
    }

    public void agregarEmpleado(Empleado empleadoNuevo) {
        empleados.add(empleadoNuevo);
        System.out.println("empleado nuevo agregado con exito a la lista de "+nombre+" !!!");
    } 
}