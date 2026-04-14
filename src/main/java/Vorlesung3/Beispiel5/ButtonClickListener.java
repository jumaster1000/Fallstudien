package Vorlesung3.Beispiel5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button wurde geklickt (mit eigener Klasse)!");
    }
}
