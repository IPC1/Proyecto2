/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2E;

/**
 *
 * @author Pau
 */
public class nodo {
    private String direccion;
    private String producto;
    private int cantidad;
    private boolean facturacion;
    private boolean envio;
    private nodo siguiente;
    public nodo(String direccion, boolean facturacion, boolean envio, nodo siguiente){
        this.direccion=direccion;
        this.envio=envio;
        this.facturacion=facturacion;
        this.siguiente=siguiente;
    }
    public nodo(String producto, int cantidad, nodo siguiente){
        this.producto=producto;
        this.cantidad=cantidad;
        this.siguiente=siguiente;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public boolean isFacturacion() {
        return facturacion;
    }
    public void setFacturacion(boolean facturacion) {
        this.facturacion = facturacion;
    }
    public boolean isEnvio() {
        return envio;
    }
    public void setEnvio(boolean envio) {
        this.envio = envio;
    }
    public nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
