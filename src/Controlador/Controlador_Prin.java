package Controlador;
import Modelos.PjBuldier;
import Vista.VentanaPrincipal;
import Vista.Vista_Creador;
import Vista.Vista_Guadados;
import Vista.Vista_de_pj;

public class Controlador_Prin {
    public Controlador_Prin(VentanaPrincipal Vista,PjBuldier pjBuldier){
        Vista.setVisible(true);
        Vista.crearButton.addActionListener(e -> {
            Vista_Creador vista_creador = new Vista_Creador();
            Vista_de_pj vista_de_pj = new Vista_de_pj();
            Controlador_creador controlador_creador = new Controlador_creador(vista_creador,pjBuldier,Vista,vista_de_pj);
            vista_creador.setVisible(true);
            Vista.dispose();
        });
        Vista.verCreadosButton.addActionListener(e -> {
            Vista_Guadados vista_guadados = new Vista_Guadados();
            Controlador_guardados controlador_guardados = new Controlador_guardados(vista_guadados,pjBuldier,Vista);
        });
        
    }
}
