

public class Main{

    public static void main(String[] args) {
        Crucero crucero = new Crucero(500, 10000, 6500);
        crucero.nuevasReservas(15);
        crucero.mensajeSocorro("ashuda por favor¡¡");
        System.out.println();

        Portaaviones portaaviones = new Portaaviones(50, 2000);
        portaaviones.mensajeSocorro("Perdimos la batalla, manden otro portaaviones.");
        System.out.println();


        Pesquero pesquero = new Pesquero(60, 300, 35);
        pesquero.mensajeSocorro("El Capitán Schettino necesita ayuda para enderezar el Crucero");

    }
}
