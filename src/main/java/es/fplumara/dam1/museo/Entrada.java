package es.fplumara.dam1.museo;
import java.time.LocalDate;

abstract class Entrada {

    private String id;
    private double precioBase;
    private  LocalDate fecha;


    //Constructor
    protected Entrada(String id, LocalDate fecha, double precioBase) {
        this.id = id;
        this.fecha = fecha;
        this.precioBase = precioBase;
    }


    //Atributos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    //Metodos
    abstract double precioFinal(); {
    }

    abstract String descripcion();
    }

