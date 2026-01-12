package es.fplumara.dam1.restaurante;

public class Ensalada extends ProductoMenu implements Personalizable, AptoPara{




    @Override
    public boolean aptoPara(String apto) {
        return false;
    }

    @Override
    public void anadirExtra(String nombreExtra, double costeExtra) {

    }

    @Override
    double precioFinal() {
        return 0;
    }

    @Override
    String ticketLine() {
        return "";
    }
}
