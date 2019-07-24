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
public class ThTrovaPari extends Thread {

    DatiCondivisi datiC;
    
    public ThTrovaPari(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        for (int i = 0; i < datiC.v.length; i++) {
            datiC.chiediPermesso1();
            datiC.IncrementaPari();
            datiC.daiPermesso2();
        }
    }
}
