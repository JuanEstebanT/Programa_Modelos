package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame{
    public JButton crearButton;
    private JPanel panel1;
    public JButton verCreadosButton;

    public VentanaPrincipal(){
        setContentPane(panel1);
        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Create PJ 1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createUIComponents() {
        Color celeste = new Color(134,245,227);
        panel1 = new JPanel();
        panel1.setBackground(celeste);
    }
}
