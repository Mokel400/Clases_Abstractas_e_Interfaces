package es.fplumara.dam1.restaurante;
import java.util.ArrayList;
import java.util.List;

public class Hamburguesa extends ProductoMenu implements Personalizable{

    private tipoCarne tipoCarne;
    private List<Extras> extras;

    public Hamburguesa(String id, String nombre, double precioBase, tipoCarne tipoCarne) throws IllegalAccessException {
        super(id, nombre, precioBase);
        this.tipoCarne = tipoCarne;
        this.extras = new ArrayList<>();
    }

    @Override
    public void anadirExtra(String nombreExtra, double costeExtra) {
        if (nombreExtra == null || nombreExtra.isBlank()){
            throw new IllegalArgumentException("El extra debe tener un nombre");
        }
        if (costeExtra <= 0){
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        }
        this.extras.add(new Extras(nombreExtra, costeExtra));

    }

    @Override
    double precioFinal() {
        double precioExtras = extras.stream().mapToDouble(Extras::precioExtra).sum();
        double precioFinal = precioExtras + getPrecioBase();
        return precioFinal;
    }

    @Override
    String ticketLine() {
        return "[HAMBURGUESA]" + getNombre() + "(carne: " + this.tipoCarne + ") | base: " + getPrecioBase() + "€ | extras: " + extras.size() + " | total: " + precioFinal() + " € ";
    }
}
