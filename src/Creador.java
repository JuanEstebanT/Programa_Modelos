import Modelos.PjBuldier;
import Vista.VentanaPrincipal;
import Controlador.Controlador_Prin;
/**
 * Objtos armas
 * Personajes masivos
 * afectoar caracteristicas
 */
import static Modelos.PjBuldier.Pjnuevo;

public class Creador {
    public static void main(String[] args) {
        PjBuldier pjBuldier = Pjnuevo();
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        Controlador_Prin controlador_prin = new Controlador_Prin(ventanaPrincipal,pjBuldier);
    }
}
