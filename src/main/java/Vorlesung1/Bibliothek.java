package Vorlesung1;

import javax.swing.*;

public class Bibliothek extends JFrame {
    private JTextField titelTextField;
    private JTextField autorTextField;
    private JRadioButton jaRadioButton;
    private JRadioButton neinRadioButton;
    private JButton hinzufügenButton;
    private JButton verfügbareBücherAnzeigenButton;
    private JTextField benutzerTextField;
    private JButton ausleihenButton;
    private JButton rückgabeButton;
    private JPanel hauptPanel;

    private Bibliothek(){
        setTitle("Bibliothekverwaltungssystem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,350);
        setContentPane(hauptPanel);
        setVisible(true);
        setResizable(false);


    }

    public static void main(){
        new Bibliothek();
    }
}
