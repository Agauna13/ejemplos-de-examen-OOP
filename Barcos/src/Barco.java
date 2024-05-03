public interface Barco {

    public void alarma();
    public void mensajeSocorro();

    /*el hecho de que se pidan comportamientos en común entre barcos implica la creación de una interfaz de métodos que
    todos los tipos de barco vayan a implementar ya que asi nos ahorramos repetir código e instancias un metodo alarma o
    mensajeSocorro en cada clase Barco*/
}
