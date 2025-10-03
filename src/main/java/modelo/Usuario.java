package modelo;

abstract class Usuario {

    private String nombreUsuario;
    private String contrasenia;
    private String correo;
    private String nombre;
    private String apellido;


    public Usuario(String nombreUsuario, String contrasenia, String correo, String nombre, String apellido) {
        setNombreUsuario(nombreUsuario);
        setContrasenia(contrasenia);
        setCorreo(correo);
        setNombre(nombre);
        setApellido(apellido);
    }

    // getters y setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede ser nulo o vacío.");
        }
        if (nombreUsuario.length() > 50) {
            throw new IllegalArgumentException("El nombre de usuario no puede tener más de 50 caracteres.");
        }
        this.nombreUsuario = nombreUsuario.trim();
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        if(contrasenia == null || contrasenia.isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede ser nula o vacía.");
        }
        if (contrasenia.length() < 5) {
            throw new IllegalArgumentException("La contraseña debe tener más de 5 caracteres.");
        }
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.trim().isEmpty()) {
            throw new IllegalArgumentException("El correo no puede ser nulo o vacío.");
        }
        if (correo.length() > 100) {
            throw new IllegalArgumentException("El correo no puede tener más de 100 caracteres.");
        }
        if (!correo.contains("@")) {
            throw new IllegalArgumentException("El correo debe ser válido.");
        }
        this.correo = correo.trim();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        if (nombre.length() > 50) {
            throw new IllegalArgumentException("El nombre no puede tener más de 50 caracteres.");
        }
        this.nombre = nombre.trim();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede ser nulo o vacío.");
        }
        if (apellido.length() > 50) {
            throw new IllegalArgumentException("El apellido no puede tener más de 50 caracteres.");
        }
        this.apellido = apellido.trim();
    }

}
