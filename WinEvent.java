package Model.Listener;

import java.awt.Component;
import java.awt.event.ComponentEvent;
import fifteenpuzzlehra.FifteenPuzzleHra.*;
import javax.swing.JFrame;

public class WinEvent extends ComponentEvent {
    public WinEvent(Component cmpnt, int i) {
        super(cmpnt, i);
    }
}
