import java.util.Objects;

public class Sets implements Comparable<Sets> {
    private String nombre;
    private String apellido;
    private String telefono;

    public Sets(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String toString() {
        return nombre + " " + apellido + " - " + telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sets)) return false;
        Sets c = (Sets) o;
        return nombre.equals(c.nombre) && apellido.equals(c.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public int compareTo(Sets c) {
        int nombreCmp = this.nombre.compareTo(c.nombre);
        if (nombreCmp != 0) return nombreCmp;
        return this.apellido.compareTo(c.apellido);
    }
}
