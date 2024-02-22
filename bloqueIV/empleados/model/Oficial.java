package es.daw.poo2.empleados.model;

/**
 *
 * @author melol
 */
public class Oficial extends Operario {

    public Oficial() {
    }

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }

    // Método que muestra información básica del oficial
    public String mostrarInformacionBasica() {
        return "Nombre: " + this.getNombre(); // Se accede al nombre a través del getter en lugar de acceder directamente al atributo
    }
}
