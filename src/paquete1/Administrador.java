/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author ADRIAN
 */
public class Administrador extends Empleado
{
    //CONSTRUCTOR
    public Administrador(String usuario, int contraseña, int dni, String nombre, String apellido, String rol) 
    {
        super(usuario, contraseña, dni, nombre, apellido, rol);
    }
    
    

    
     // ---- EMPLEADOS ----
    public void crearEmpleado(Hotel hotel, Empleado empleado) {
        hotel.getEmpleados().add(empleado);
    }

    public void modificarEmpleado(Hotel hotel, String nombreActual, String apellidoActual, String usuario, int contraseña, int dni, String nombre, String apellido, String rol) {
        
        for (int i = 0; i < hotel.getEmpleados().size(); i++) 
        {
            Empleado empleado = hotel.getEmpleados().get(i);
            if(empleado.getNombre().equals(nombreActual) && empleado.getApellido().equals(apellidoActual))
            {
                empleado.setUsuario(usuario);
                empleado.setContraseña(contraseña);
                empleado.setNombre(nombre);
                empleado.setApellido(apellido);
                empleado.setDni(dni);
                empleado.setRol(rol);
                return;
            }
        }
        String texto = "No existe empleado con ese nombre y apellido";
        ErrorG e = new ErrorG(texto);
        e.setVisible(true);

    }

    public void eliminarEmpleado(Hotel hotel, String nombre, String apellido) 
    {
        for (int i = 0; i < hotel.getEmpleados().size(); i++) 
        {
            Empleado empleado = hotel.getEmpleados().get(i);
            if(empleado.getNombre().equals(nombre) && empleado.getApellido().equals(apellido))
            {
                hotel.getEmpleados().remove(empleado);
                return;
            }  
        }
        String texto = "No existe un empleado con ese nombre y apellido";
        ErrorG e = new ErrorG(texto);
        e.setVisible(true);
    }


    // ---- HABITACIONES ----
    public void registrarHabitacion(Hotel hotel, Habitacion habitacion) {
        hotel.getHabitaciones().add(habitacion);
    }

    public void modificarHabitacion(Habitacion habitacion, int numero, int capacidad, float precio, String tipo, boolean disp, boolean limp) {
        habitacion.setNumero(numero);
        habitacion.setCapacidad(capacidad);
        habitacion.setPrecioPorNoche(precio);
        habitacion.setTipo(tipo);
        habitacion.setDisponibilidad(disp);
        habitacion.setLimpieza(limp);
    }

    public void eliminarHabitacion(Hotel hotel, Habitacion habitacion) {
        hotel.getHabitaciones().remove(habitacion);
    }


    // ---- SERVICIOS ADICIONALES ----
    public void registrarServicioAdi(Hotel hotel, ServicioAdicional serv) {
        hotel.getServicios().add(serv);
    }

    
    public void modificarServicio2(Hotel hotel, String nombreActual, String nombreNuevo, float precioNuevo) {
        for (int i = 0; i < hotel.getServicios().size(); i++) 
        {
            if(hotel.getServicios().get(i).getNombreServAdi().equals(nombreActual))
            {
                hotel.getServicios().get(i).setNombreServAdi(nombreNuevo);
                hotel.getServicios().get(i).setPrecioServAdi(precioNuevo);
                return;
            }
        }
        String texto = "No hay un servicio con ese nombre";
        ErrorG e = new ErrorG(texto);
        e.setVisible(true);
    }

    public void eliminarServicio(Hotel hotel, ServicioAdicional s) {
        hotel.getServicios().remove(s);
    }
    
}
