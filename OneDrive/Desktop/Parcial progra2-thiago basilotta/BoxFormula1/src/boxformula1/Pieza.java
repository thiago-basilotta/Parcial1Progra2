/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxformula1;

public abstract class Pieza {
    
    private String nombre; 
    private String ubicacion;
    private CondicionClimatica condicion; 

public Pieza(String nombre, String ubicacion, CondicionClimatica condicion) {
this.nombre = nombre;
this.ubicacion = ubicacion;
this.condicion = condicion;
}


public String getNombre() { return nombre; }
public String getUbicacion() { return ubicacion; }
public CondicionClimatica getCondicion() { return condicion; }



@Override
public boolean equals(Object o) {


if (this == o) 
    
    return true;

if (o == null || getClass() != o.getClass()) 
    
    return false;
Pieza pieza = (Pieza) o;

return nombre.equalsIgnoreCase(pieza.nombre) && ubicacion.equalsIgnoreCase(pieza.ubicacion);
}


@Override
public int hashCode()
{
return (nombre.toLowerCase() + "|" + ubicacion.toLowerCase()).hashCode();
}


@Override
public String toString() {
    

return String.format("%s (Ubicación: %s, Condición: %s)", nombre, ubicacion, condicion);

}

}