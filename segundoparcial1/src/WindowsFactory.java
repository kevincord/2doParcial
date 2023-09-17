public class WindowsFactory implements AbstractFactory {
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaWindows();
    }

    @Override
    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoWindows();
    }

}