package Vista;

import javax.swing.*;

public class Vista_de_pj extends JFrame{
    public JLabel imagenPj;
    public JLabel Nombre_txt;
    public JLabel Sexo_txt;
    public JLabel Raza_txt;
    public JLabel Rol_txt;
    public JLabel stats_txt;
    public JPanel panel1;

    public Vista_de_pj(){
        setContentPane(panel1);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Create PJ 1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
