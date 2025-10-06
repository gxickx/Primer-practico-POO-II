package modelo;

public class Direccion {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    private String pais;

    public Direccion(String calle, String ciudad, String provincia, String codigoPostal, String pais){
        setCalle(calle);
        setCiudad(ciudad);
        setProvincia(provincia);
        setCodigoPostal(codigoPostal);
        setPais(pais);
    }

    //getters y setters
    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String getProvincia() {
        return provincia;
    }
    
    public String getCodigoPostal() {
        return codigoPostal;
    }
        
    public String getPais() {
        return pais;
    }
    



    public void setCalle(String calle) {
        if (calle == null || calle.trim().isEmpty()) {
            throw new IllegalArgumentException("La calle no puede ser nula o vacía.");
        }
        if (calle.length() > 100) {
            throw new IllegalArgumentException("La calle no puede tener más de 100 caracteres.");
        }
        this.calle = calle.trim();
    }


    public void setCiudad(String ciudad) {
        if (ciudad == null || ciudad.trim().isEmpty()) {
            throw new IllegalArgumentException("La ciudad no puede ser nula o vacía.");
        }
        if (ciudad.length() > 50) {
            throw new IllegalArgumentException("La ciudad no puede tener más de 50 caracteres.");
        }
        this.ciudad = ciudad.trim();
    }

    public void setProvincia(String provincia) {
        if (provincia == null || provincia.trim().isEmpty()) {
            throw new IllegalArgumentException("La provincia no puede ser nula o vacía.");
        }
        if (provincia.length() > 50) {
            throw new IllegalArgumentException("La provincia no puede tener más de 50 caracteres.");
        }
        this.provincia = provincia.trim();
    }

    public void setCodigoPostal(String codigoPostal) {
        if (codigoPostal == null || codigoPostal.trim().isEmpty()) {
            throw new IllegalArgumentException("El código postal no puede ser nulo o vacío.");
        }
        if (!codigoPostal.matches("\\d{4,10}")) { // Validar que contenga solo dígitos y tenga entre 4 y 10 caracteres
            throw new IllegalArgumentException("El código postal debe contener solo dígitos y tener entre 4 y 10 caracteres.");
        }
        this.codigoPostal = codigoPostal.trim();
    }

        
    public void setPais(String pais) {
        if (pais == null || pais.trim().isEmpty()) {
            throw new IllegalArgumentException("El país no puede ser nulo o vacío.");
        }
        if (pais.length() > 50) {
            throw new IllegalArgumentException("El país no puede tener más de 50 caracteres.");
        }
        this.pais = pais.trim();
    }
 

}
