package br.usp.ime.liamf;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int nSlots = new Integer(args[0]);
        int nColors = new Integer(args[1]);
        int nTries = new Integer(args[2]);
        String winner;
        try {
            Mastermind game = new Mastermind(nSlots, nColors, nTries);
            if (game.play())
                winner = "CodeBreaker";
            else
                winner = "CodeMaker";
            System.out.println(winner + " wins!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*for (int i = 0; i < nSlots; i++)
            for (int j = 0; j < nColors; j++) {
                int aux = (j*nSlots) + i + 1;
                System.out.print("x" + i + j +":    ");
                System.out.println(aux);
        }*/
    }
}
