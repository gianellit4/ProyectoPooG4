/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;


public class Reservacion 
{
    private int noches;
    private String tipoHabitacion;
    private Estadia estadia;
    private Habitacion habitacion;
    private ArrayList<Huesped> HuespedesDeReservacion;
    private int numeroPersonas;
    private int numeroR;
    private int cont;
    private String CheckIN;
    private String CheckOUT;

    //CONSTRUCTOR
    public Reservacion(Hotel hotel, int noches, String tipoHabitacion, Estadia estadia, ArrayList<Huesped> arreglo) {
        this.noches = noches;
        this.tipoHabitacion = tipoHabitacion;
        this.estadia = estadia;
        this.HuespedesDeReservacion = arreglo;
        this.numeroR = hotel.getReservaciones().size()+1;
        this.CheckOUT = "NO";
    }
    
    //GETTERS Y SETTERS

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Estadia getEstadia() {
        return estadia;
    }

    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public ArrayList<Huesped> getHuespedesDeReservacion() {
        return HuespedesDeReservacion;
    }

    public void setHuespedesDeReservacion(ArrayList<Huesped> HuespedesDeReservacion) {
        this.HuespedesDeReservacion = HuespedesDeReservacion;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public int getNumeroR() {
        return numeroR;
    }

    public void setNumeroR(int numeroR) {
        this.numeroR = numeroR;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getCheckIN() {
        return CheckIN;
    }

    public void setCheckIN(String CheckIN) {
        this.CheckIN = CheckIN;
    }

    public String getCheckOUT() {
        return CheckOUT;
    }

    public void setCheckOUT(String CheckOUT) {
        this.CheckOUT = CheckOUT;
    }
    
    
    
    
    public void CalcularNroPersonas()
    {
        this.numeroPersonas = this.HuespedesDeReservacion.size();
    }
    

    

    
    
}
