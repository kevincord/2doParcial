public class Juego {
    private AbstractFactory factory;

    public Juego(AbstractFactory factory) {
        this.factory = factory;
    }

    public void crearInterfazUsuario() {
        Boton boton = factory.crearBoton();
        Ventana ventana = factory.crearVentana();
        CuadroTexto cuadroTexto = factory.crearCuadroTexto();

    }
}