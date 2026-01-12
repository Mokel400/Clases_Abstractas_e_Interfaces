package es.fplumara.dam1.restaurante;

abstract class ProductoMenu {

    private String id;
    private String nombre;
    private double precioBase;

    protected ProductoMenu(String id, String nombre, double precioBase) throws IllegalAccessException {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;

        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("El Id no puede estar vacio");
        }
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if (precioBase <= 0){
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract double precioFinal();
    abstract String ticketLine();
}
