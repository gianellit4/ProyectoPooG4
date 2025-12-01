/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;


public class Hotel 
{
    private ArrayList<Habitacion> ArregloHabitaciones = new ArrayList<>();
    private ArrayList<ServicioAdicional> ArregloServiciosAdi = new ArrayList<>();
    private ArrayList<Huesped> ArregloHuespedes = new ArrayList<>();
    private ArrayList<Reservacion> ArregloReservaciones = new ArrayList<>();
    private ArrayList<Empleado> ArregloEmpleados = new ArrayList<>();

    public ArrayList<Habitacion> getHabitaciones() { return ArregloHabitaciones; }
    public ArrayList<ServicioAdicional> getServicios() { return ArregloServiciosAdi; }
    public ArrayList<Huesped> getHuespedes() { return ArregloHuespedes; }
    public ArrayList<Reservacion> getReservaciones() { return ArregloReservaciones; }
    public ArrayList<Empleado> getEmpleados() { return ArregloEmpleados; }
    
    
    //LOGIN
    public Empleado login(String usuario, int contraseña) 
    {
        for (int i=0; i<ArregloEmpleados.size(); i++) 
        {
            if (ArregloEmpleados.get(i).getUsuario().equals(usuario) && ArregloEmpleados.get(i).getContraseña()==contraseña) 
            {
                return ArregloEmpleados.get(i);
            }
        }
            return null;
    }
    
}
