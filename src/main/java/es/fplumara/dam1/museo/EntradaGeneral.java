package es.fplumara.dam1.museo;
import java.time.LocalDate;

public class EntradaGeneral extends Entrada{
    public EntradaGeneral(String id, LocalDate fecha, double precioBase) {
        super(id, fecha, precioBase);
    }


    //Metodos
    @Override
    double precioFinal() {
        return 0;
    }

    @Override
    String descripcion() {
        return "";
    }

}
