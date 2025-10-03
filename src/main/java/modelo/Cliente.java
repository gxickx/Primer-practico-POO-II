package modelo;

public class Cliente extends Usuario {
    private String direccion;
    private String telefono;

    public Cliente(String nombreUsuario, String contrasenia, String correo, String nombre, String apellido, String direccion, String telefono) {
        super(nombreUsuario, contrasenia, correo, nombre, apellido);
        setDireccion(direccion);
        setTelefono(telefono);
    }

    // getters y setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede ser nula o vacía.");
        }
        if (direccion.length() > 150) {
            throw new IllegalArgumentException("La dirección no puede tener más de 150 caracteres.");
        }
        this.direccion = direccion.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede ser nulo o vacío.");
        }
        if (!telefono.matches("\\d{7,15}")) { // Validar que contenga solo dígitos y tenga entre 7 y 15 caracteres
            throw new IllegalArgumentException("El teléfono debe contener solo dígitos y tener entre 7 y 15 caracteres.");
        }
        this.telefono = telefono.trim();
    }
    
}
