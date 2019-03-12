/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbase;

/**
 *
 * @author yaird
 */
public class ExamenBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Persona obj = new Persona();
        IngresarDatos obj = new IngresarDatos();
        obj.pedirTodosDatos();
        
        IngresarDatos obj2 =new IngresarDatos();
        obj2.pedirDatos();
        
        IngresarDatos obj3 =new IngresarDatos();
        obj3.datosPorDefecto();
    }
    
}
