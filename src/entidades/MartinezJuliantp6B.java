/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Julian Martinez <juli450@gmail.com>
 */
public class MartinezJuliantp6B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directorio d1 = new Directorio();
        d1.agregarCliente(1162368388L, 28043262L, "GianFranco", "Bruno", "San Luis", "La Punta");
        d1.agregarCliente(1162368386L, 28043263L, "Pablo", "BarrioNuevo", "San Luis", "Capital");
        d1.agregarCliente(1162368387L, 28043261L, "Julian", "Martinez", "San Luis", "Merlo");
        System.out.println("los clientes son: " + d1.totalClientes().toString());
        System.out.println("El cliente borrado es: " + d1.borrarCliente(28043261L).toString());
        System.out.println("los clientes son: " + d1.totalClientes().toString());
        System.out.println("el cliente buscado es: " + d1.buscarCliente(1162368385L).toString());
        System.out.println("el cliente buscado es: " + d1.buscarClientes("Capital").toString());
        System.out.println("el cliente buscado es: " + d1.buscarTelefono("Bruno").toString());
        //vistas
        Vistas.Desktop desk = new Vistas.Desktop(d1);
        desk.setVisible(true);
    }

}
