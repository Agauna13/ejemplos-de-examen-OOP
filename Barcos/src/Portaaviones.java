public class Portaaviones implements Barco{
    private int nAviones;
    private int nMarines;

    public Portaaviones(){

    }

    public Portaaviones(int nAviones, int nMarines){
        this.nAviones = nAviones;
        this.nMarines = nMarines;
        System.out.println(toString());
    }


    public String toString(){
        return "Portaaviones: " +
                "Capacidad de carga: " + nAviones +"\n"+
                "Tripulación: " + nMarines;

    }


    @Override
    public void alarma() {
        System.out.println("Alarma: Ataque inminente, todos a sus puestos, preparen los aviones de combate");
    }

    @Override
    public void mensajeSocorro(String mensaje) {
        alarma();
        System.out.println("msgSocorro: " + mensaje);
    }


    /*los métodos get y set en esta clase no serán necesarios porque a pesar de que podemos encapsular correctamente
    la información, con el metodo toString podemos imprimir esa info sin necesidad de getters o setters. En Síntesis,
    el método toString nos hace de getter global. Por otra parte, al crear un nuevo objeto, el propio contstructor nos
    hace las vecesde setter a través del 'this' que nos reasigna el valor de la variable pasandola por parametro.*/
}
