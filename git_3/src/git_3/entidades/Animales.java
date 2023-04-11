/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_3.entidades;

/**
 *
 * @author Cesar Vallejos
 */
public class Animales {
    private String nombre;
    private int edad;
    private String tipo;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animales() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
