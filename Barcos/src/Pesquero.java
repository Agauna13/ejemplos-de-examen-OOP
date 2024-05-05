public class Pesquero implements Barco{
    private int eslora;
    private int potencia;
    private int tripulacion;

    public Pesquero(){

    }

    public Pesquero(int eslora, int potencia, int tripulacion){
        this.eslora = eslora;
        this.potencia = potencia;
        this.tripulacion = tripulacion;
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Barco Pesquero. \n" +
                "Eslora: " + eslora + "\n" +
                "Potencia: " + potencia + "CV" + "\n"+
                "Tripulacion: " + tripulacion;

    }

    @Override
    public void alarma(){
        System.out.println("Alarma: Condiciones temporales adversas");

    }

    @Override
    public void mensajeSocorro(String mensaje){
        alarma();
        System.out.println("msgSocorro: " + mensaje);
    }
}
