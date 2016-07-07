/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import arbol.AVL;
import arbol.nodoAvl;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Pau
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Archivos ar = new Archivos();
        AVL arbol = new AVL();
         
       String blabla= "Hola dani como estas yo tengo mucho sueño y blabla no se que mas poner";
         StringTokenizer st = new StringTokenizer(blabla);
         while(st.hasMoreTokens()){
             String palabra= st.nextToken();
             arbol.insertar(palabra,palabra);
         }
        /*
        nodoAvl avl2= new nodoAvl("pau", "pau");
        arbol.insertar(avl2);
        nodoAvl avl3= new nodoAvl("arbol", "arbol");
        arbol.insertar(avl3);
        nodoAvl avl4= new nodoAvl("casa", "casa");
        arbol.insertar(avl4);
        nodoAvl avl5= new nodoAvl("zorro", "zorro");
        arbol.insertar(avl5);
        nodoAvl avl6= new nodoAvl("montar", "montar");
        arbol.insertar(avl6);
        nodoAvl avl7= new nodoAvl("daniel", "daniel");
        arbol.insertar(avl7);
         nodoAvl avl8= new nodoAvl("alejandro", "alejandro");
        arbol.insertar(avl8);
         nodoAvl avl9= new nodoAvl("zapeta", "zapeta");
        arbol.insertar(avl9);
         nodoAvl avl10= new nodoAvl("moshi", "moshi");
        arbol.insertar(avl10);
        nodoAvl avl11= new nodoAvl("panquesito", "panquesito");
        arbol.insertar(avl11);
        */String puntero=null;
        System.out.println(arbol.dibujar(puntero, arbol.getRaiz()));
        ar.archivoAVL("PRUEBA", arbol);
    }
    
}
