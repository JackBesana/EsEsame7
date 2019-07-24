/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame7;

/**
 *
 * @author besan
 */
public class ThScorri extends Thread {
    
    DatiCondivisi datiC;

    public ThScorri(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        for (int i = 0; i < datiC.v.length; i++) {
            System.out.println("Prendo in considerazione la lettera " + (int) datiC.v[i]);

            if ((datiC.v[i] % 2) == 0) {
                datiC.daiPermesso1();
              } else {
                datiC.daiPermesso3();
             }
              datiC.chiediPermesso2();
        }
    }
}
