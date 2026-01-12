package es.fplumara.dam1.restaurante;

public class Postre extends ProductoMenu{

    private boolean esCasero;

    protected Postre(String id, String nombre, double precioBase, boolean esCasero) throws IllegalAccessException {
        super(id, nombre, precioBase);
        this.esCasero = esCasero;
    }


    @Override
    double precioFinal() {
        double precioFinal = getPrecioBase();
        if (esCasero){
            precioFinal += 1.50;
        }
        return precioFinal;
    }

    @Override
    String ticketLine() {
        return "";
    }
}
