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
public class Recepcionista extends Empleado
{
    //CONSTRUCTOR
    public Recepcionista(String usuario, int contraseña, int dni, String nombre, String apellido, String rol) 
    {
        super(usuario, contraseña, dni, nombre, apellido, rol);
    }
    
    
    // ---- RESERVACIONES ----
    public void crearReservacion(Hotel hotel, Reservacion r) {
        hotel.getReservaciones().add(r);
    }


    // ---- HUESPEDES ----
    public void registrarHuesped(Hotel hotel, Huesped h) {
        hotel.getHuespedes().add(h);
    }

    public void modificarHuesped(Hotel hotel, String nombreActual, String apellidoActual, int dni, String nombre, String apellido, String datos) {
        for (int i = 0; i < hotel.getHuespedes().size(); i++) 
        {
            Huesped h = hotel.getHuespedes().get(i);
            if(h.getNombreHuesped().equals(nombreActual) && h.getApellidoHuesped().equals(apellidoActual))
            {
                h.setDNIhuesped(dni);
                h.setNombreHuesped(nombre);
                h.setApellidoHuesped(apellido);
                h.setDatosContacto(datos);
                return;
            }
        }
        String texto = "No hay huesped con ese nombre y apellido";
        ErrorG e = new ErrorG(texto);
        e.setVisible(true);
    }

    public void eliminarHuesped(Hotel hotel, Huesped h) {
        hotel.getHuespedes().remove(h);
    }

    
    public Habitacion CheckIn2(Hotel hotel, Reservacion reservacion)
    {
        for (int i = 0; i < hotel.getHabitaciones().size(); i++) 
        {
            Habitacion habitacion = hotel.getHabitaciones().get(i);
            if(habitacion.getCapacidad()==reservacion.getNumeroPersonas())
            {
                if(habitacion.getTipo().equals(reservacion.getTipoHabitacion()))
                {
                    if(habitacion.isDisponibilidad()==true)
                    {
                        if(habitacion.isLimpieza()==true)
                        {
                            System.out.println("Se asigno la habitacion");
                            habitacion.setDisponibilidad(false);
                            reservacion.setCheckIN("SI");
                            return habitacion;
                        }

                    }
                }
            }
        }
        return null;
 
    }
    

    
    public void CheckOut(Hotel hotel, Reservacion reservacion)
    {
        Habitacion habitacion = reservacion.getHabitacion();
        habitacion.setDisponibilidad(true);
        habitacion.setLimpieza(false);
        reservacion.setCheckOUT("SI");

    }
    
    public void AñadirCosumoServicios(Reservacion reservacion, ServicioAdicional servicio)
    {
        reservacion.getEstadia().getArregloConsumoServAdi().add(servicio);
    }

    public Huesped BuscarHuesped(Hotel hotel, int dni)
    {
        for (int i = 0; i < hotel.getHuespedes().size(); i++) 
        {
            int DNI = hotel.getHuespedes().get(i).getDNIhuesped();
            if(DNI==dni)
            {
                return hotel.getHuespedes().get(i);
            }
            
        }
        return null;
    }
    
    public ServicioAdicional BuscarServicio(Hotel hotel, String serv)
    {
        for (int i = 0; i < hotel.getServicios().size(); i++) 
        {
            if(hotel.getServicios().get(i).getNombreServAdi().equals(serv))
            {
                return hotel.getServicios().get(i);
            }
        }
        return null;
    }
    
    public int CantidadServicios (Hotel hotel,Reservacion reserv, String servicio)
    {
        int cont = 0;
        for (int i = 0; i < reserv.getEstadia().getArregloConsumoServAdi().size(); i++) 
        {
            if(reserv.getEstadia().getArregloConsumoServAdi().get(i).getNombreServAdi().equals(servicio))
            {
                cont=cont+1;
            }
        }
        return cont;
    }
    
    
}
