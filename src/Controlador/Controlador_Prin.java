package Controlador;

import Modelos.PjBuldier;
import Vista.VentanaPrincipal;
import Vista.Vista_Creador;
import Vista.Vista_de_pj;

public class Controlador_Prin {
    public Controlador_Prin(VentanaPrincipal Vista){
        Vista_Creador vista_creador = new Vista_Creador();
        Vista.setVisible(true);
        Vista.crearButton.addActionListener(e -> {
            PjBuldier pjBuldier = new PjBuldier();
            Controlador_creador controlador_creador = new Controlador_creador(vista_creador,pjBuldier);
            vista_creador.setVisible(true);
            Vista.dispose();
        });
    }
}
