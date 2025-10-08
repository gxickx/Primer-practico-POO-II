package modelo;

public class Producto {
    private String nombre;
    private String descripcion;
    private float precio;
    private int stockActual;
    private int stockMinimo;

    public Producto(String nombre, String descripcion, float precio, int stockActual, int stockMinimo){
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
        setStockActual(stockActual);
        setStockMinimo(stockMinimo);
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    public int getStockActual() {
        return stockActual;
    }
    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setNombre(String nombre) {
        if (nombre.trim().isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.trim().isBlank()){
            throw new IllegalArgumentException("La descripción no puede estar vacío.");
        }
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        if (precio <= 0){
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public void setStockActual(int stockActual) {
        if (stockActual <= 0){
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stockActual = stockActual;
    }

    public void setStockMinimo(int stockMinimo){
        if (stockMinimo <= 0){
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stockMinimo = stockMinimo;
    }

    
}
