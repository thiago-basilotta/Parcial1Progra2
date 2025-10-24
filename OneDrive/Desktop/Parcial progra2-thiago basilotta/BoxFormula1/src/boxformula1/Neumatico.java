/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxformula1;

/**
 *
 * @author thiag
 */
public class Neumatico extends Pieza{
    
    private Compuesto compuesto; 
    

    public Neumatico(String nombre, String ubicacion, CondicionClimatica condicion, Compuesto compúesto)
    
    {
        super(nombre, ubicacion, condicion);
        
        this.compuesto = compuesto;
    }

    public Compuesto getCompuesto() 
    {
        
        return compuesto;
    }

    @Override
    
    public String toString()
            
    {
  
        return super.toString() + String.format(" - Neumatico{compuesto=%s}", compuesto);
    }
    
    
    
    
}
