package es.fplumara.dam1.museo;
import java.time.LocalDate;

public class EntradaVIP extends Entrada implements Descontable, conAccesoRapido{

    //Constructor
    protected EntradaVIP(String id, LocalDate fecha, double precioBase, String zonaVIP, int nivleDePriodidad) {
        super(id, fecha, precioBase);
        this.zonaVIP = zonaVIP;
        this.nivleDePriodidad = nivleDePriodidad;
    }


    //Atributos
    private String zonaVIP;
    private int nivleDePriodidad;


    //Metodos
    @Override
    public int aplicarDescuento(double porcentajeDescuento) {
        return 0;
    }

    @Override
    double precioFinal() {
        return 0;
    }

    @Override
    String descripcion() {
        return "";
    }

    @Override
    public int prioridadAcceso() {
        return 0;
    }
}








