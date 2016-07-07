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
public class lista {
    nodo inicio,fin;
    public lista (){
        inicio=null;
        fin=null;
    }
     public boolean vacia(){
         return inicio==null;
     }
    public void pushCola(int cantidad, String producto, nodo siguiente){//inserta un nodo producto, es una cola al final
        nodo nuevo= new nodo(producto, cantidad, siguiente);
         if (!vacia()){
             fin.setSiguiente(nuevo);
         }else{
             inicio= nuevo;
         }
         fin=nuevo;
     }
     
     public String popCola(){//obtiene el nodo primero
         String retorno = inicio.getCantidad()+" "+inicio.getProducto();
         inicio=inicio.getSiguiente();
         return retorno;
     }
    
     public void pushLista(String direccion, boolean facturacion, boolean envio, nodo siguiente){//inserta al principio
         nodo nuevo= new nodo(direccion, facturacion, envio, siguiente);
         if(!vacia()){
             nuevo.setSiguiente(inicio);
             inicio=nuevo;
         }else{
             inicio=nuevo;
         }
     }
     
     public void pop(String direccion){
        nodo auxiliar,n;
        auxiliar=n=inicio;
        while((!auxiliar.getDireccion().equals(direccion))){//queda en el nodo que debo sacar
            n=auxiliar;
            auxiliar= auxiliar.getSiguiente();
        }
        n.setSiguiente(auxiliar.getSiguiente());
    }
}
