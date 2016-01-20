package com.example.diegoorozco.trabajofinal;

/**
 * Created by Usuario on 17/01/2016.
 */
public class Pedido {

    private String Pedido;
    private String Comentarios;
    private String Cantidad;

    public Pedido(String Pedido,String Comentarios,String Cantidad){

        this.Pedido=Pedido;
        this.Comentarios=Comentarios;
        this.Cantidad=Cantidad;
    }

    public String getPedido() {
        return Pedido;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public String getCantidad() {
        return Cantidad;
    }
}
