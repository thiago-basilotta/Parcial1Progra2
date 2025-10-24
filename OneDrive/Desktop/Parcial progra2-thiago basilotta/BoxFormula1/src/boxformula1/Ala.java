/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxformula1;

public class Ala extends Pieza implements Ajustable{
    
    private int cargaAerodinamica;
    

    public Ala(String nombre, String ubicacion, CondicionClimatica condicion, int cargaAerodinamica) {
    super(nombre, ubicacion, condicion);
    
    if (cargaAerodinamica < 1 || cargaAerodinamica > 10) {
        throw new IllegalArgumentException("La carga aerodinámica debe estar entre 1 y 10");
    }
    
    this.cargaAerodinamica = cargaAerodinamica;
}


    public int getCargaAerodinamica() {
        
        return cargaAerodinamica;
    }
    
   
    @Override
    public void Ajustar() {
        
        System.out.printf("Ajustando Ala '%s' en '%s': cambiando angulo y flap (Carga: %d)\\n",
        getNombre(), getUbicacion(), cargaAerodinamica);
        
    }
    

    @Override
    public String toString() {
        
     return super.toString() + String.format(" - Ala{cargaAerodinamica=%d}", cargaAerodinamica);
}
    
    
    
    
    
    
}
