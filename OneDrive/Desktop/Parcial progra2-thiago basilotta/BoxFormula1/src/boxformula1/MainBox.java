/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boxformula1;



public class MainBox {
    
    
    public static void main(String[] args) {
        
        BoxManager box = new BoxManager();
        
        try {
Motor m1 = new Motor("PU-016", "Estación Motor", CondicionClimatica.SECO, 1000);
box.agregarPieza(m1);


Motor mDup = new Motor("PU-016", "Estación Motor", CondicionClimatica.SECO, 980);
try {
box.agregarPieza(mDup);
} catch (PiezaDuplicadaException ex) {
System.out.println("Excepción detectada al agregar duplicado: " + ex.getMessage());
}


Ala a1 = new Ala("Ala-Delantera", "Estación Aero", CondicionClimatica.MIXTO, 7);
box.agregarPieza(a1);


Neumatico n1 = new Neumatico("Pirelli-S", "Carro Neumáticos", CondicionClimatica.SECO, Compuesto.SOFT);
box.agregarPieza(n1);


} catch (PiezaDuplicadaException e) {
System.err.println(e.getMessage());
}


System.out.println();
box.mostrarPiezas();


System.out.println();
box.ajustarPiezas();


System.out.println();
box.buscarPiezasPorCondicion(CondicionClimatica.LLUVIA);
System.out.println();
box.buscarPiezasPorCondicion(CondicionClimatica.SECO);
}
        
    }