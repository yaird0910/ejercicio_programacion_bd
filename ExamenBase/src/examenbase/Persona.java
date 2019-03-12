/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbase;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author yaird
 */
public class Persona {
    private String nombre;
    private int edad = 0;
    private String NSS;
    private char sexo = 'h';
    private float peso = 0, altura = 0;

    public Persona() {
        generaNSS();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        
        generaNSS();
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        
        generaNSS();
    }
    
    
    public int calcularIMC(){
        float imc = peso/(altura*altura);
                
        if((sexo == 'h' && imc < 20) || (sexo == 'm' && imc < 19))
            return -1;
        else if((sexo == 'h' && imc <= 25) || (sexo == 'm' && imc <= 24))
            return 0;
        return 1;
    }
    
    public boolean esMayorDeEdad(){
        if(edad >= 18)
            return true;
        return false;
    }
    
    private boolean comprobarSexo(char sexo){
        if(this.sexo == sexo)
            return true;
        return false;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", NSS=" + NSS + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
        
    private void generaNSS(){
        SecureRandom random = new SecureRandom();
        String texto = new BigInteger(130, random).toString(32);
        NSS = texto.substring(0, 8);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    
}
