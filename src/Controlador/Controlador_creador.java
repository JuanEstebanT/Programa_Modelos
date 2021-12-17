package Controlador;
import Modelos.PjBuldier;
import Vista.VentanaPrincipal;
import Vista.Vista_Creador;
import Vista.Vista_de_pj;
import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

public class Controlador_creador {
    public Controlador_creador(Vista_Creador Vista, PjBuldier pjBuldier, VentanaPrincipal ventanaPrincipal,Vista_de_pj vista_de_pj ){
        Vista.BoxRaza.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }
            @Override
            public void focusLost(FocusEvent e) {
                String Raza = Vista.BoxRaza.getSelectedItem().toString();
                ImageIcon icon = new ImageIcon("src/Imagenes/"+Raza+".PNG");
                Vista.Imagen.setIcon(icon);
            }
        });
        Vista.listoButton.addActionListener(e -> {
            Vista.dispose();
            pjBuldier.ConfigNombre(Vista.textNombre.getText()).ConfigRoll(Objects.requireNonNull(Vista.BoxRoll.getSelectedItem()).toString()).ConfigSexo(Vista.BoxSexo.getSelectedItem().toString()).ConfigRaza(Vista.BoxRaza.getSelectedItem().toString()).build();
            System.out.println(pjBuldier.getPjnuevo().toString());
            JOptionPane.showMessageDialog(null,"personaje creado exitosamente");
            Controlador_Vista_de_pj controlador_vista_de_pj = new Controlador_Vista_de_pj(vista_de_pj,pjBuldier,ventanaPrincipal);
        });

    }
}
