/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author ADRIAN
 */
public class ServicioAdicional 
{
    private String nombreServAdi;
    private float precioServAdi;
    
    //CONSTRUCTOR
    public ServicioAdicional(String nombreServAdi, float precioServAdi) {
        this.nombreServAdi = nombreServAdi;
        this.precioServAdi = precioServAdi;
    }
    
    //GETTERS Y SETTERS

    public String getNombreServAdi() {
        return nombreServAdi;
    }

    public void setNombreServAdi(String nombreServAdi) {
        this.nombreServAdi = nombreServAdi;
    }

    public float getPrecioServAdi() {
        return precioServAdi;
    }

    public void setPrecioServAdi(float precioServAdi) {
        this.precioServAdi = precioServAdi;
    }
    
    
    
    
}
