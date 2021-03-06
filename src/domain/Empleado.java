package domain;

public class Empleado extends Persona{
//    Atributos
    private int idEmpleado;
    private double sueldo;
//    Es un contador
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
//  Recibimos el argumentos desde la clase padre
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

//    toString
    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + this.idEmpleado +
                ", sueldo=" + this.sueldo +
                ", " + (super.toString()) +
                '}';
    }
}
