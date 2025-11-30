/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author ADRIAN
 */
public class Main 
{
    public static void main(String[] args) 
    {
        //CREAR HOTEL
        Hotel hotel = new Hotel();
        
        //CREAR ALGUNOS EMPLEADOS
        Administrador A1 = new Administrador("A1", 1111, 674389, "Sergio", "Perez", "Administrador");
        Administrador A2 = new Administrador("A2", 2222, 786878, "Adrian", "Onaga", "Administrador");
        Administrador A3 = new Administrador("A3", 3333, 78867, "Alex", "Kadena", "Administrador");
        Recepcionista R1 = new Recepcionista("R1", 4444, 678686, "Maribel", "Yi", "Recepcionista");
        Recepcionista R2 = new Recepcionista("R2", 5555, 879876, "Fabiola", "Uribe", "Recepcionista");
        Recepcionista R3 = new Recepcionista("R3", 5555, 324234, "Erick", "Fan", "Recepcionista");
        
        //AGREGAR A ARREGLO EMPLEADOS
        hotel.getEmpleados().add(A1);
        hotel.getEmpleados().add(A2);
        hotel.getEmpleados().add(A3);
        hotel.getEmpleados().add(R1);
        hotel.getEmpleados().add(R2);
        hotel.getEmpleados().add(R3);
        
        
        
    }
}
