/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;

/**
 *
 * @author ADRIAN
 */
public class Estadia 
{
    private float precioTotalNoches;
    private float precioConsumoServ;
    private float precioTotal;
    private ArrayList<ServicioAdicional> ArregloConsumoServAdi = new ArrayList<>();
    
    //GETTERS Y SETTERS

    public float getPrecioTotalNoches() {
        return precioTotalNoches;
    }

    public void setPrecioTotalNoches(float precioTotalNoches) {
        this.precioTotalNoches = precioTotalNoches;
    }

    public float getPrecioConsumoServ() {
        return precioConsumoServ;
    }

    public void setPrecioConsumoServ(float precioConsumoServ) {
        this.precioConsumoServ = precioConsumoServ;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public ArrayList<ServicioAdicional> getArregloConsumoServAdi() {
        return ArregloConsumoServAdi;
    }

    public void setArregloConsumoServAdi(ArrayList<ServicioAdicional> ArregloConsumoServAdi) {
        this.ArregloConsumoServAdi = ArregloConsumoServAdi;
    }
    
    
    public void CalcularPrecioTotalNoches(Reservacion reserva)
    {
        float precioXnoche = reserva.getHabitacion().getPrecioPorNoche();
        int noches = reserva.getNoches();
        this.precioTotalNoches = precioXnoche*noches;
    }
    
    public void CalcularPrecioConsumoServ()
    {
        float suma=0;
        for (int i = 0; i < this.ArregloConsumoServAdi.size(); i++) 
        {
            suma = suma + ArregloConsumoServAdi.get(i).getPrecioServAdi();
        }
        this.precioConsumoServ = suma;
    }
    
    public void CalcularPrecioTotal()
    {
        this.precioTotal = this.precioTotalNoches + this.precioConsumoServ;
    }
}
