/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbase;

import java.util.Scanner;

/**
 *
 * @author yaird
 */
public class IngresarDatos {
    String nombre;
    int edad = 0;
    String NSS;
    char sexo = 'h';
    float peso = 0, altura = 0;

            
    public void pedirTodosDatos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el nombre de la persona: ");
        nombre = scanner.nextLine();
        System.out.print("Ingresa la edad de la persona: ");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa el genero de la persona: ");
        sexo = scanner.nextLine().charAt(0);
        System.out.print("Ingresa el peso de la persona: ");
        peso = Float.parseFloat(scanner.nextLine());
        System.out.print("Ingresa el altura de la persona: ");
        altura = Float.parseFloat(scanner.nextLine());
        
        Persona obj1 = new Persona(nombre, edad, sexo, peso, altura);
        comprobarPeso(obj1);
        comprobarEdad(obj1);
        System.out.println(obj1.toString());
    }
    
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el nombre de la persona: ");
        nombre = scanner.nextLine();
        System.out.print("Ingresa la edad de la persona: ");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa el genero de la persona: ");
        sexo = scanner.nextLine().charAt(0);
        
        Persona obj2 = new Persona(nombre, edad, sexo);
        obj2.setPeso((float) 80.18);
        obj2.setAltura((float) 1.84);
        comprobarPeso(obj2);
        comprobarEdad(obj2);
        System.out.println(obj2.toString());
    }
        
    public void datosPorDefecto() {
        Persona obj3 = new Persona();
        obj3.setNombre("Juan");
        obj3.setEdad(23);
        obj3.setSexo('h');
        obj3.setPeso((float) 73.18);
        obj3.setAltura((float) 1.72);
        
        comprobarPeso(obj3);
        comprobarEdad(obj3);
        System.out.println(obj3.toString());
    }
    
    
    public void comprobarPeso(Persona obj){
        switch (obj.calcularIMC()) {
            case -1:
                System.out.println("La persona esta baja de peso");
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                break;
            default:
                System.out.println("La persona tiene sobrepeso");
                break;
        }
    }
    
    public void comprobarEdad(Persona obj){
        if(obj.esMayorDeEdad())
            System.out.println("La persona es mayor de edad");
        else
            System.out.println("La persona es menor de edad");
    }
}
