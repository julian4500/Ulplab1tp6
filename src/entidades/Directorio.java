/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Julian Martinez <juli450@gmail.com>
 */
public class Directorio {

    private TreeMap<Long, Cliente> Directorio;

    public Directorio() {
        Directorio = new TreeMap<>();
    }

    public int agregarCliente(Long telefono, Long dni, String nombre, String apellido, String direccion, String ciudad) {
        Directorio.put(telefono, new Cliente(dni, nombre, apellido, direccion, ciudad));
        return 1;
    }

    public Cliente buscarCliente(Long telefono) {
        return Directorio.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> list1 = new java.util.HashSet<Long>();
        Set<Long> x = Directorio.keySet();
        Iterator it = x.iterator();
        while (it.hasNext()) {
            long num = (long) it.next();
            Cliente cli = Directorio.get(num);
            if (cli.getApellido().equals(apellido)) {
                list1.add(num);

            }

        }
        return list1;
    }

    public List<Cliente> buscarClientes(String ciudad) {
        List<Cliente> list2;
        list2 = new ArrayList<>();
        Set x = Directorio.keySet();
        Iterator it = x.iterator();
        while (it.hasNext()) {
            long num = (long) it.next();
            Cliente cli = Directorio.get(num);
            if (cli.getCiudad().equals(ciudad)) {
                list2.add(cli);
            }
        }
        return list2;
    }

    public TreeMap<Long, Cliente> borrarCliente(Long dni) {
        TreeMap<Long, Cliente> list2;
        list2 = new TreeMap<>();
        Set x = Directorio.keySet();
        Iterator it = x.iterator();
        boolean yaencontro = false;
        while (it.hasNext() && !yaencontro) {
            long num = (long) it.next();
            Cliente cli = Directorio.get(num);
            if (cli.getDni() == dni) {
                yaencontro = true;
                list2.put(num, cli);
                Directorio.remove(num);
            }

        }
        return list2;
    }
    
    public TreeMap<Long, Cliente> totalClientes(){
        return Directorio;
    }

}
