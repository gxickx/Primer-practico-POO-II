package modelo;

public class Producto {
    private String nombre;
    private String descripcion;
    private float precio;
    private int stockActual;
    private int stockMinimo;

    public Producto(String nombre, String descripcion, float precio, int stockActual, int stockMinimo){
        if (nombre.trim().isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (descripcion.trim().isBlank()){
            throw new IllegalArgumentException("La descripción no puede estar vacío.");
        }
        if (precio <= 0){
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        if (stockMinimo <= 0){
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        if (stockActual <= 0){
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
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
    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }
    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
    
}
