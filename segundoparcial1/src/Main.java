public class Main {
    public static void main(String[] args) {
        // Ejecuta en Windows
        Juego juegoWindows = new Juego(new WindowsFactory());
        juegoWindows.crearInterfazUsuario();

        // Ejecuta en macOS
        Juego juegoMac = new Juego(new MacFactory());
        juegoMac.crearInterfazUsuario();

        // Ejecuta en Linux
        Juego juegoLinux = new Juego(new LinuxFactory());
        juegoLinux.crearInterfazUsuario();
    }
}