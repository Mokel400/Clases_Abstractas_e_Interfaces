package es.fplumara.dam1.museo;

import java.time.LocalDate;

public class EntradaEstudiante extends Entrada implements Descontable{

    public EntradaEstudiante(String id, LocalDate fecha, double precioBase, String centroEscolar) {
        super(id, fecha, precioBase);
        this.centroEscolar = centroEscolar;
    }
    private String centroEscolar;


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
}
