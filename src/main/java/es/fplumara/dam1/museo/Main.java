package es.fplumara.dam1.museo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Entrada> entradas = new ArrayList<>();

        //Entradas generales
        entradas.add(new EntradaGeneral("0001", LocalDate.now(), 15.99));
        entradas.add(new EntradaGeneral("0002", LocalDate.now(), 15.99));

        //Entradas estudiante
        entradas.add(new EntradaEstudiante("0003", LocalDate.now(), 12.99, "IES Santa María del Bosque"));
        entradas.add(new EntradaEstudiante("0004", LocalDate.now(), 12.99, "IES Gabriel García-Marquez"));

        //Entradas VIP
        entradas.add(new EntradaVIP("0005", LocalDate.now(), 8.99, "Zona de impresionismo", 10));
        entradas.add(new EntradaVIP("0006", LocalDate.now(), 8.99, "Zona de cubismo", 5));
    }
}