public class Crucero implements Barco {
    private int eslora;
    private int camasTotales;
    private int camasOcupadas = 0;


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
        return "Crucero: \n" +
                "Eslora: " + eslora + "\n" +
                "Aforo máximo: " + camasTotales + "\n" +
                "Camas Ocupadas:  " + camasOcupadas;
    }

    public void nuevasReservas(int reservas){
        camasOcupadas += reservas;
        System.out.println(reservas + " nuevas" + "\n" +
                "El total de camas ocupadas es de: " + (camasOcupadas) + "\n" +
                "el porcentaje de ocupación es de " + ((camasOcupadas * 100)/ camasTotales) + "%");
    }


    @Override
    public void alarma() {
        System.out.println("Alarma: Abandonen el barco cuesta abajo.");
    }

    @Override
    public void mensajeSocorro(String mensaje) {
        alarma();
        System.out.println("msgSocorro: " + mensaje);
    }


}
