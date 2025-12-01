/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;



public class Habitacion 
{
    private int numero, capacidad;
    private float precioPorNoche;
    private String tipo;
    private boolean disponibilidad;
    private boolean limpieza;

    //CONSTRUCTOR
    public Habitacion(int numero, int capacidad, float precioPorNoche, String tipo, boolean disponibilidad, boolean limpieza) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.precioPorNoche = precioPorNoche;
        this.tipo = tipo;
        this.limpieza = limpieza;
        this.disponibilidad = disponibilidad;
    }
    
    //GETTERS Y SETTERS

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(float precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
    
   
    
}
