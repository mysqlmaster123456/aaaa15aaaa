package Model;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

public class SuperTlacitko extends JButton implements Observer {

    //vlastnosti
    private int index;
    private ModelVypocet m;
    Komponent rodic;
    
    public SuperTlacitko() {
        //this(-1);
    }

    //constructor
    public SuperTlacitko(int index, Komponent k) {
        super();
        m = ModelVypocet.getInstance();
        m.addObserver(this);
        this.index = index;
        this.setFont(new Font("Tahoma", 1, 16));
        this.setBackground(Color.WHITE);
        this.setText(String.valueOf(m.getBoard()[this.index]));
        this.rodic = k;

        if (m.getBoard()[index] == 0) {
            this.setBackground(Color.white);
            this.setText("");
        }

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                m.Move(index, rodic);
                if(m.win())rodic.spustUdalost();
            }
        });
    }

    @Override
    public void update(Observable o, Object o1) {
        this.setText(String.valueOf(m.getBoard()[this.index]));
        this.setBackground(Color.WHITE);
        if (m.getBoard()[index] == 0) {
            this.setBackground(Color.white);
            this.setText("");
        }
    }

}
