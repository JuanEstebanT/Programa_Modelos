import Modelos.Personaje;
import Modelos.PjBuldier;
import Vista.VentanaPrincipal;
import Controlador.Controlador_Prin;

public class Creador {
    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        Controlador_Prin controlador_prin = new Controlador_Prin(ventanaPrincipal);
       // example();
    }

    public static void example(){
        Personaje PJ = PjBuldier.Pjnuevo().ConfigNombre("Juan").ConfigRaza("emo").ConfigRoll("Mago").ConfigSexo("Helokoter300").build();
        System.out.println(PJ.toString());
    }
}
