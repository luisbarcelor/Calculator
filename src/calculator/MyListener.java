package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    private static String origenEvento;

    public static String getOrigenEvento() {
        return origenEvento;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        origenEvento = event.getActionCommand();
        Run.ejecutarEnEvento();
    }
}
