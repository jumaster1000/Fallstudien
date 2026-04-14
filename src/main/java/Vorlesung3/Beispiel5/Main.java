package Vorlesung3.Beispiel5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Beispiel");
        JButton button = new JButton("Klick mich!");

        button.addActionListener(new ButtonClickListener());

        frame.add(button);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
