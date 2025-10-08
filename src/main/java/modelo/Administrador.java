package modelo;

public class Administrador extends Usuario {
    private String legajo;

    public Administrador(String nombreUsuario, String contrasenia, String correo, String nombre, String apellido, String legajo) {
        super(nombreUsuario, contrasenia, correo, nombre, apellido);
        setLegajo(legajo);
    }

    // getters y setters
    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        if (legajo == null || legajo.trim().isEmpty()) {
            throw new IllegalArgumentException("El legajo no puede ser nulo o vacío.");
        }
        if (legajo.length() > 30) {
            throw new IllegalArgumentException("El legajo no puede tener más de 30 caracteres.");
        }
        this.legajo = legajo.trim();
    }
    
}
