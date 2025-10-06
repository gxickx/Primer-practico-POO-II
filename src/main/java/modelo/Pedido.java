package modelo;
import java.util.Date;

public class Pedido {
    private Estados estado;
    private Date fechaPedido;
    private int idPedido;

    public Pedido(Estados estado, Date fechaPedido, int idPedido){
        setEstado(estado);
        setFechaPedido(fechaPedido);
        setIdPedido(idPedido);
    }

    // getters y setters
    public Estados getEstado() {
        return estado;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }



    public void setEstado(Estados estado) {
        if (estado == null) {
            throw new IllegalArgumentException("El estado no puede ser nulo.");
        }
        this.estado = estado;
    }

    public void setFechaPedido(Date fechaPedido) {
        if (fechaPedido == null) {
            throw new IllegalArgumentException("La fecha del pedido no puede ser nula.");
        }
        this.fechaPedido = fechaPedido;
    }
    
    public void setIdPedido(int idPedido) {
        if (idPedido <= 0) {
            throw new IllegalArgumentException("El ID del pedido debe ser un número positivo.");
        }
        this.idPedido = idPedido;
    }

}
