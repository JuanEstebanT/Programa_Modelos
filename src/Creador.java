import Modelos.Personaje;
import Modelos.PjBuldier;

public class Creador {
    public static void main(String[] args) {
        example();
    }
    public static void example(){
        Personaje PJ = PjBuldier.Pjnuevo().ConfigNombre("Juan").ConfigRaza("emo").ConfigRoll("Arquero").ConfigSexo("Helokoter300").build();
        System.out.println(PJ.toString());
    }
}
