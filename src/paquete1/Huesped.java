/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;


public class Huesped 
{
    private int DNIhuesped;
    private String nombreHuesped;
    private String apellidoHuesped;
    private String datosContacto;
    
    //CONSTRUCTOR
    public Huesped(int DNIhuesped, String nombreHuesped, String apellidoHuesped, String datosContacto) {
        this.DNIhuesped = DNIhuesped;
        this.nombreHuesped = nombreHuesped;
        this.apellidoHuesped = apellidoHuesped;
        this.datosContacto = datosContacto;
    }
    
    //GETTERS Y SETTERS

    public int getDNIhuesped() {
        return DNIhuesped;
    }

    public void setDNIhuesped(int DNIhuesped) {
        this.DNIhuesped = DNIhuesped;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public String getApellidoHuesped() {
        return apellidoHuesped;
    }

    public void setApellidoHuesped(String apellidoHuesped) {
        this.apellidoHuesped = apellidoHuesped;
    }

    public String getDatosContacto() {
        return datosContacto;
    }

    public void setDatosContacto(String datosContacto) {
        this.datosContacto = datosContacto;
    }
    
    
    
    
    
}
