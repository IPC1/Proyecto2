/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import arbol.AVL;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pau
 */
public class Archivos {
    public void archivoAVL(String nombre, AVL arbol) throws IOException{
        String ruta = nombre+".dot";
        File f = new File(ruta);
        FileWriter fw =new FileWriter(f);
        BufferedWriter bw= new BufferedWriter (fw);
        String texto=null;
        bw.write(arbol.dibujar(texto, arbol.getRaiz())+"}");
        bw.close();
    }
}
