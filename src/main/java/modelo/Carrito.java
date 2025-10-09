package modelo;

import java.time.*;


public class Carrito {

    private int idCarrito;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificado;

    public Carrito (int idCarrito, LocalDateTime fechaCreacion, LocalDateTime fechaModificado) {

    }
    //getters y setters
    public int getIdCarrito() {
        return idCarrito;
    }
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    public LocalDateTime getFechaModificado() {
        return fechaModificado;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = LocalDateTime.now();
    }
    public void setFechaModificado(LocalDateTime fechaModificado) {
        this.fechaModificado = LocalDateTime.now();
    }

    // metodos
    public void agregarProducto(Producto unProducto, int cantidad){
        //logica para agregar producto
    }
    public void eliminarProducto(Producto unProducto){
        //logica para eliminar un producto
    }

    public void modificarCantidad(Producto unProducto, int cantidad){
        //modifica la cantidad
    }

    public void iniciarProcesoPago(Carrito carrito){
        //se inivia un proceso de pago con el carrito

    }

}
