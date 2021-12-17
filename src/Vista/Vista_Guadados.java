package Vista;

import javax.swing.*;

public class Vista_Guadados extends JFrame {
    public JPanel panel1;
    public JLabel imagenPj;
    public JLabel Nombre_txt;
    public JLabel Raza_txt;
    public JLabel Rol_txt;
    public JLabel stats_txt;
    public JLabel Sexo_txt;
    public JButton buscarButton;
    public JTextField textField1;
    public JPanel Panel_primario;
    public JButton volverButton;

    public Vista_Guadados(){
        setContentPane(Panel_primario);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Create PJ 1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
