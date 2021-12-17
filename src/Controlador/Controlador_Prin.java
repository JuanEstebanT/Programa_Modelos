package Controlador;

import Modelos.PjBuldier;
import Vista.VentanaPrincipal;
import Vista.Vista_Creador;

public class Controlador_Prin {
    public Controlador_Prin(VentanaPrincipal Vista){
        Vista.setVisible(true);
        Vista.crearButton.addActionListener(e -> {
            PjBuldier pjBuldier = new PjBuldier();
            Vista_Creador vista_creador = new Vista_Creador();
            Controlador_creador controlador_creador = new Controlador_creador(vista_creador,pjBuldier);
            vista_creador.setVisible(true);
            Vista.dispose();
        });
    }
}
