import Controlador.Controlador_guardados;
import Modelos.Personaje;
import Modelos.PjBuldier;
import Vista.VentanaPrincipal;
import Controlador.Controlador_Prin;
import Vista.Vista_Guadados;

public class Creador {
    public static void main(String[] args) {
        PjBuldier pjBuldier = new PjBuldier();
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        Controlador_Prin controlador_prin = new Controlador_Prin(ventanaPrincipal,pjBuldier);
    }
}
