/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxformula1;


public class Motor extends Pieza implements Ajustable {
    
    
    private int potenciaMaxima;

    
    public Motor (String nombre, String ubicacion, CondicionClimatica condicion, int potenciaMaxima){
    
    super(nombre, ubicacion, condicion);
    this.potenciaMaxima = potenciaMaxima;
    
}
    
    public int getPotenciaMaxima(){
        
        return potenciaMaxima; 
        
    }

    @Override
    
    public void Ajustar() {
        
        System.out.printf("Ajustando Motor '%s' en %s: calibrando gestión electrónica y mapas (Potencia: %d CV)\\n",
        
        getNombre(), getUbicacion(), potenciaMaxima); 
    }

    @Override
   
    public String toString() {
    
        return super.toString() + String.format(" - Motor{potenciaMaxima=%d CV}", potenciaMaxima);
}
    
    
    
    
    
    
}
