
package Clases;

import Interfaces.INavegable;
import Interfaces.IVehiculo;

public class Barco implements IVehiculo, INavegable{
    private int velocidad;
    
    public Barco() {
        this.velocidad = 0;
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("Barco acelerado a " + velocidad + " nudos");
    }

    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) velocidad = 0;
            System.out.println("Barco frenado a " + velocidad + " nudos");
    }

    public int obtenerVelocidad() {
        return velocidad;
    }
    
    @Override
    public void navegar() {
    System.out.println("El barco está navegando.");
    }
}
        
            
        
