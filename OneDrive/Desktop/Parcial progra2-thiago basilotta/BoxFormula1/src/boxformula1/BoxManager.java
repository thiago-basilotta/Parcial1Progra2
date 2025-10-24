/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxformula1;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;





public class BoxManager {
   
    private final Map<String, Pieza> piezas = new HashMap<>();
    
    
    private String keyFor(Pieza p)
    {
return p.getNombre().toLowerCase() + "|" + p.getUbicacion().toLowerCase();
}


public void agregarPieza(Pieza pieza) 
        
    throws PiezaDuplicadaException {
    
        String key = keyFor(pieza);
            
            if (piezas.containsKey(key)) {
                
            throw new PiezaDuplicadaException(
                        
        String.format("Ya existe una pieza con nombre '%s' en la ubicación '%s'",
                            
    pieza.getNombre(), pieza.getUbicacion()));
}
    
            piezas.put(key, pieza);

        
            System.out.println("Pieza agregada: " + pieza.getNombre() + " en " + pieza.getUbicacion());
}


public void mostrarPiezas() {
    
if (piezas.isEmpty())
{
System.out.println("No hay piezas registradas en el box.");


return;

}

System.out.println("Listado de piezas en el box:");

for (Pieza p : piezas.values())

{
    
System.out.println(" - " + p.toString());

}
}


public void ajustarPiezas() {
    
if (piezas.isEmpty()) {
    
System.out.println("No hay piezas para ajustar.");

return;

}

System.out.println("Iniciando ajuste de piezas...");

for (Pieza p : piezas.values()) {
    
if (p instanceof Ajustable) {
    
((Ajustable) p).Ajustar();

} else {
    
System.out.printf("La pieza '%s' en %s no puede ajustarse (no ajustable).\n",
p.getNombre(), p.getUbicacion());


        }
    }
}


public List<Pieza> buscarPiezasPorCondicion(CondicionClimatica condicion) {
    
List<Pieza> resultado = new ArrayList<>();

for (Pieza p : piezas.values()) {
    
if (p.getCondicion() == condicion) resultado.add(p);

}

if (resultado.isEmpty()) {
    
System.out.printf("No se encontraron piezas para la condición climática: %s\n", condicion);

} else {
    
System.out.printf("Piezas encontradas para la condición %s:\n", condicion);

for (Pieza p : resultado) System.out.println(" - " + p.toString());

}

return resultado;

}
    
    
}
