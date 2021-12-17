package Controlador;

import Modelos.PjBuldier;
import Vista.VentanaPrincipal;
import Vista.Vista_de_pj;

public class Controlador_Vista_de_pj {
    public Controlador_Vista_de_pj(Vista_de_pj Vista, PjBuldier pj,VentanaPrincipal ventanaPrincipal){
        Vista.setVisible(true);
        Vista.imagenPj.setIcon(pj.getPjnuevo().getIcon());
        Vista.Nombre_txt.setText("Nombre: "+pj.getPjnuevo().getName());
        Vista.Sexo_txt.setText("Sexo: "+pj.getPjnuevo().getSexo());
        Vista.Rol_txt.setText("Rol: "+pj.getPjnuevo().getRoller());
        Vista.Raza_txt.setText("Raza: "+pj.getPjnuevo().getRaza());
        Vista.stats_txt.setText("<html><body> Atributos: <br>"+pj.getPjnuevo().toString()+"</body></html>");
        Vista.inicioButton.addActionListener(e -> {
            Vista.dispose();
            ventanaPrincipal.setVisible(true);
        });
    }
}
