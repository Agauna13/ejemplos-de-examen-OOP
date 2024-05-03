public class Crucero implements Barco {
    private int eslora;
    private int camasTotales;
    private int camasOcupadas;


    public Crucero(){
    }

    public Crucero(int eslora, int camasTotales, int camasOcupadas){
        this.eslora = eslora;
        this.camasTotales = camasTotales;
        this.camasOcupadas = camasOcupadas;
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return "Crucero Creado.\n" +
                "Metros de eslora: " + eslora + "\n" +
                "Aforo máximo: " + camasTotales + "\n" +
                "Pasajes Vendidos:  " + camasOcupadas;
    }

    @Override
    public void alarma() {
        System.out.println("Abandonen el barco cuesta abajo.");
    }

    @Override
    public void mensajeSocorro() {
        System.out.println("El Capitán Schettino necesita ayuda para enderezar el Crucero");
    }

}
