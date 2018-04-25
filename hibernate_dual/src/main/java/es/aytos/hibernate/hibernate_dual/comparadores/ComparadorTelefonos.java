package es.aytos.hibernate.hibernate_dual.comparadores;

import java.util.*;

import es.aytos.hibernate.hibernate_dual.modelo.*;

public class ComparadorTelefonos implements Comparator<Telefono> {

    @Override
    public int compare(Telefono o1, Telefono o2) {
        // return o1.getTelefono().compareTo(o2.getTelefono());
        return o2.getTelefono().compareTo(o1.getTelefono());
    }
}
