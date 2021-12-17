package Vista;

import javax.swing.*;

public class Vista_Creador extends JFrame{
    public JComboBox BoxSexo;
    public JComboBox BoxRoll;
    public JTextField textNombre;
    public JComboBox BoxRaza;
    public JButton listoButton;
    public JPanel panel1;
    public JLabel Imagen;

    public Vista_Creador(){
        setContentPane(panel1);
        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Create PJ 1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
