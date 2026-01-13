package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Ensalada extends ProductoMenu implements Personalizable, AptoPara{

    private tamanoEnsalada tamano;
    private List<Extras> extras;

    public Ensalada(String id, String nombre, double precioBase, tamanoEnsalada tamano) throws IllegalAccessException {
        super(id, nombre, precioBase);
        this.tamano = tamano;
        this.extras = new ArrayList<>();
    }

    @Override
    public boolean aptoPara(String restriccion) {
        if (!restriccion.equalsIgnoreCase("vegano") && !restriccion.equalsIgnoreCase("vegetariano")){
            throw new IllegalArgumentException("Debe ser vegano o vegetariano");
        }
        if (restriccion.equalsIgnoreCase("vegetariano")){
            return true;
        } else if (restriccion.equalsIgnoreCase("vegano") && (extras.isEmpty())){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void anadirExtra(String nombreExtra, double costeExtra) {
        if (nombreExtra == null || nombreExtra.isBlank()) {
            throw new IllegalArgumentException("El extra debe tener un nombre");
        }
        if (costeExtra <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        }
        this.extras.add(new Extras(nombreExtra, costeExtra));
    }
    @Override
    double precioFinal() {
        double precioExtras = extras.stream().mapToDouble(Extras::precioExtra).sum();
        double precioFinal = precioExtras + getPrecioBase();
        if (this.tamano == tamanoEnsalada.GRANDE){
            precioFinal += 2;
        }
        return precioFinal;
    }

    @Override
    String ticketLine() {
        if (this.tamano.equals(tamanoEnsalada.GRANDE)){
            return "[ENSALADA]" + getNombre() + "(tamaño: " + this.tamano + ") | base: " + getPrecioBase() + "€ | incremento por tamaño: 2€ | extras: " + extras.size() + " | total: " + precioFinal() + " € ";
        } else {
            return "[ENSALADA]" + getNombre() + "(tamaño: " + this.tamano + ") | base: " + getPrecioBase() + "€ | incremento por tamaño: 0€ | extras: " + extras.size() + " | total: " + precioFinal() + " € ";
        }

    }


}


