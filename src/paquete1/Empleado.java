/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author ADRIAN
 */
public class Empleado 
{
    protected String usuario;
    protected int contraseña;
    protected int dni;
    protected String nombre, apellido, rol;
    
    //CONSTRUCTOR
    public Empleado(String usuario, int contraseña, int dni, String nombre, String apellido, String rol) 
    {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }
    
    //GETTERS Y SETTERS

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
