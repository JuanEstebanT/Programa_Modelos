package Modelos;

import javax.swing.*;

public class Razas extends Roles{
    public ImageIcon icon;

    public ImageIcon getIcon() {
        return icon;
    }

    public void selctraza(String raza){
        setRaza(raza);
        icon = new ImageIcon("src/Imagenes/"+raza+".PNG");
    }

}
