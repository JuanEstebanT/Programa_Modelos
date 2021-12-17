package Controlador;

import Modelos.Personaje;
import Modelos.PjBuldier;
import Vista.VentanaPrincipal;
import Vista.Vista_Guadados;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Controlador_guardados {
    public Controlador_guardados(Vista_Guadados vista, PjBuldier pjs, VentanaPrincipal vistaPrin){
        vista.setVisible(true);
        vista.buscarButton.addActionListener(e -> {
          String busqueda = vista.textField1.getText();
          if(comprobador(busqueda, pjs.getPjGuardados())){
              vista.imagenPj.setIcon(obtenerpj(busqueda,pjs).getIcon());
              vista.Nombre_txt.setText("Nombre: "+obtenerpj(busqueda,pjs).getName());
              vista.Sexo_txt.setText("Sexo: "+obtenerpj(busqueda,pjs).getSexo());
              vista.Rol_txt.setText("Rol: "+obtenerpj(busqueda,pjs).getRoller());
              vista.Raza_txt.setText("Raza: "+obtenerpj(busqueda,pjs).getRaza());
              vista.stats_txt.setText("<html><body> Atributos: <br>"+obtenerpj(busqueda,pjs).toString()+"</body></html>");
          }
        });

        vista.volverButton.addActionListener(e -> {
            vista.dispose();
            vistaPrin.setVisible(true);
        });

    }

    public Personaje obtenerpj(String Nombre, PjBuldier pjs){
        Personaje pjselect = null;
        ArrayList<Personaje> busqueda = new ArrayList<>();
        busqueda = pjs.getPjGuardados();

        if(comprobador(Nombre,busqueda)){
            for(Personaje d: busqueda){
                if(d.getName().equals(Nombre)){
                  pjselect = d;

                }
            }
        }else{
            pjselect = null;
            pjselect.setName("No Existe");
        }

        return pjselect;
    }

    public Boolean comprobador(String Nombre, ArrayList<Personaje> lista){
        Boolean ver =false;
        for(Personaje d: lista){
            if(d.getName().equals(Nombre)){
                ver = true;
            }
        }
        return ver;
    }
}
