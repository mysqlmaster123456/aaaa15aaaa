package Model;

import Model.Listener.*;

public class Komponent extends javax.swing.JPanel {

    private ModelVypocet m;

    public void addWinListener(WinListener c) {
        listenerList.add(WinListener.class, c);
    }

    public void removeWinListener(WinListener c) {
        listenerList.add(WinListener.class, c);
    }

    public void spustUdalost() {//projde listenerList a najde ty, co maji MyListener
        Object[] list = listenerList.getListenerList();
        for (int i = 0; i < list.length; i += 2) {//+2 protoze je tam bordel v listenerList
            Class listenerClass = (Class) (list[i]);

            if (listenerClass == WinListener.class) {
                WinListener listener = (WinListener) (list[i + 1]);
                listener.Victory(new WinEvent(this, i));
            }
        }
    }

    public Komponent() {
        m = ModelVypocet.getInstance();
        //spustUdalost();
        Shuffle();
        initComponents();
    }

    public void Shuffle() {
        m.Shuffle(5,this);//number of iterations, gets multiplied by 1000, so tread carefully
    }

    public void Reset() {
        m.Fill();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        superTlacitko1 = new Model.SuperTlacitko(0, this);
        superTlacitko2 = new Model.SuperTlacitko(1, this);
        superTlacitko3 = new Model.SuperTlacitko(2, this);
        superTlacitko4 = new Model.SuperTlacitko(3, this);
        superTlacitko5 = new Model.SuperTlacitko(4, this);
        superTlacitko6 = new Model.SuperTlacitko(5, this);
        superTlacitko7 = new Model.SuperTlacitko(6, this);
        superTlacitko8 = new Model.SuperTlacitko(7, this);
        superTlacitko9 = new Model.SuperTlacitko(8, this);
        superTlacitko10 = new Model.SuperTlacitko(9, this);
        superTlacitko11 = new Model.SuperTlacitko(10, this);
        superTlacitko12 = new Model.SuperTlacitko(11, this);
        superTlacitko13 = new Model.SuperTlacitko(12, this);
        superTlacitko14 = new Model.SuperTlacitko(13, this);
        superTlacitko15 = new Model.SuperTlacitko(14, this);
        superTlacitko16 = new Model.SuperTlacitko(15, this);

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setLayout(new java.awt.GridLayout(4, 4, 6, 6));

        superTlacitko1.setBorder(null);
        superTlacitko1.setText(null);
        superTlacitko1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superTlacitko1ActionPerformed(evt);
            }
        });
        add(superTlacitko1);

        superTlacitko2.setBorder(null);
        superTlacitko2.setText(null);
        add(superTlacitko2);

        superTlacitko3.setBorder(null);
        superTlacitko3.setText(null);
        add(superTlacitko3);

        superTlacitko4.setBorder(null);
        superTlacitko4.setText(null);
        add(superTlacitko4);

        superTlacitko5.setBorder(null);
        superTlacitko5.setText(null);
        add(superTlacitko5);

        superTlacitko6.setBorder(null);
        superTlacitko6.setText(null);
        add(superTlacitko6);

        superTlacitko7.setBorder(null);
        superTlacitko7.setText(null);
        add(superTlacitko7);

        superTlacitko8.setBorder(null);
        superTlacitko8.setText(null);
        add(superTlacitko8);

        superTlacitko9.setBorder(null);
        superTlacitko9.setText(null);
        add(superTlacitko9);

        superTlacitko10.setBorder(null);
        superTlacitko10.setText(null);
        add(superTlacitko10);

        superTlacitko11.setBorder(null);
        superTlacitko11.setText(null);
        add(superTlacitko11);

        superTlacitko12.setBorder(null);
        superTlacitko12.setText(null);
        add(superTlacitko12);

        superTlacitko13.setBorder(null);
        superTlacitko13.setText(null);
        add(superTlacitko13);

        superTlacitko14.setBorder(null);
        superTlacitko14.setText(null);
        add(superTlacitko14);

        superTlacitko15.setBorder(null);
        superTlacitko15.setText(null);
        add(superTlacitko15);

        superTlacitko16.setBorder(null);
        superTlacitko16.setText(null);
        add(superTlacitko16);
    }// </editor-fold>//GEN-END:initComponents

    private void superTlacitko1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superTlacitko1ActionPerformed

    }//GEN-LAST:event_superTlacitko1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Model.SuperTlacitko superTlacitko1;
    private Model.SuperTlacitko superTlacitko10;
    private Model.SuperTlacitko superTlacitko11;
    private Model.SuperTlacitko superTlacitko12;
    private Model.SuperTlacitko superTlacitko13;
    private Model.SuperTlacitko superTlacitko14;
    private Model.SuperTlacitko superTlacitko15;
    private Model.SuperTlacitko superTlacitko16;
    private Model.SuperTlacitko superTlacitko2;
    private Model.SuperTlacitko superTlacitko3;
    private Model.SuperTlacitko superTlacitko4;
    private Model.SuperTlacitko superTlacitko5;
    private Model.SuperTlacitko superTlacitko6;
    private Model.SuperTlacitko superTlacitko7;
    private Model.SuperTlacitko superTlacitko8;
    private Model.SuperTlacitko superTlacitko9;
    // End of variables declaration//GEN-END:variables
}
