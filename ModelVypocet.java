package Model;

import java.util.Observable;
import java.util.Random;
import javax.swing.JFrame;
import Model.Komponent;

public class ModelVypocet extends Observable {

    private boolean s = false;

    //vlastnosti
    private static ModelVypocet instance;
    private final int[] board;
    private final int[] solved = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};

    //getter, setter
    public int[] getBoard() {
        return board;
    }

    //jedinacek
    public static ModelVypocet getInstance() {
        if (instance == null) {
            instance = new ModelVypocet();
        }
        return instance;
    }

    //constructor
    public ModelVypocet() {
        board = new int[16];
        Fill();

    }

    //metody
    public void Fill() {
        for (int i = 1; i < board.length; i++) {
            board[i - 1] = i;
        }
        board[15] = 0;
        setChanged();
        notifyObservers();
    }

    private boolean TryAbove(int pos) {
        if (pos < 4) {
            return false;
        }
        if (board[pos - 4] != 0) {
            return false;
        }

        Swap(pos, pos - 4);
        return true;
    }

    private boolean TryLeft(int pos) {
        if (pos % 4 == 0) {
            return false;
        }
        if (board[pos - 1] != 0) {
            return false;
        }
        Swap(pos, pos - 1);
        return true;

    }

    private boolean TryRight(int pos) {
        if (pos % 4 == 3) {
            return false;
        }
        if (board[pos + 1] != 0) {
            return false;
        }

        Swap(pos, pos + 1);
        return true;
    }

    private boolean TryBelow(int pos) {
        if (pos > 11) {
            return false;
        }
        if (board[pos + 4] != 0) {
            return false;
        }

        Swap(pos, pos + 4);
        return true;
    }

    public boolean win() {
        //System.out.println("win check");
        //sout(board);System.out.println(" vs ");sout(solved);
        if (java.util.Arrays.equals(board, solved)) {
            //System.out.println("win pass");
            return true;
        }
        return false;
    }
    
    private void sout(int[] p){
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + ", ");
        }
        System.out.println("");
    }

    public void Move(int pos, Komponent k) {
        if (TryAbove(pos)) {
            return;
        }
        if (TryRight(pos)) {
            return;
        }
        if (TryBelow(pos)) {
            return;
        }
        if (TryLeft(pos)) {
            return;
        }

    }

    private void Swap(int first, int second) {
        int temp = board[first];
        board[first] = board[second];
        board[second] = temp;

        setChanged();
        notifyObservers();
    }

    public void Shuffle(int iterations, Komponent k) {
        Random r = new Random();
        for (int i = 0; i < r.nextInt(1000) * 100; i++) {
            r.nextInt();
        }

        for (int i = 0; i < iterations * 1000; i++) {
            Move(board[r.nextInt(16)], k);
        }

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                TryAbove(board[j]);
                TryLeft(board[j]);
            }
        }
        s = true;
    }
}
