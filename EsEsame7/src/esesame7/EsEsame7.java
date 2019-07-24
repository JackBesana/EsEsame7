/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame7;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class EsEsame7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

            System.out.println("Inserisci una parola");
            String parola = console.readLine();

            DatiCondivisi datiC = new DatiCondivisi(parola);

            ThTrovaPari th1 = new ThTrovaPari(datiC);
            ThTrovaDispari th2 = new ThTrovaDispari(datiC);
            ThScorri th3 = new ThScorri(datiC);

            th1.start();
            th2.start();
            th3.start();

            th1.join();
            th2.join();
            th3.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(EsEsame7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
