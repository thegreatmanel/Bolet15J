/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class CalculoNotas {

    public void bucle() {

        double exe1;
        double exe2;
        double exp;
        double exem;
        double expm;
        double nf;
        double nfr;
        int bol;
        double bolm;
        int x = 0;
        double bolmax = 30;


        do {
            exe1 = Double.parseDouble(JOptionPane.showInputDialog("Insira nota do examen escrito 1"));
            exe2 = Double.parseDouble(JOptionPane.showInputDialog("Insira nota do examen escrito 2"));
            exp = Double.parseDouble(JOptionPane.showInputDialog("Insira nota do examen prático"));
            bol = Integer.parseInt(JOptionPane.showInputDialog("Insira número de boletíns"));
            exem = ((exe1 + exe2) / 2) * 0.4;
            double exer=Math.round(((exe1 + exe2) / 2)*100)/100;
            expm = exp * 0.4;
            double expr=Math.round(exp*100)/100;
            if (bol / bolmax > 0.9) {
            bolm=2;}
            else if(bol/bolmax<0.7){
            bolm=0;}
            else{
            bolm=1;};
            nf=exem+expm+bolm;
            nfr=Math.round(nf*100)/100;
            JOptionPane.showMessageDialog(null, "Probas teoricas:"+exer+"/n"+"Probas prácticas:"+expr+"/n"+"Boletíns:"+bolm+"/n"+"Nota total:"+nfr+"/n");
            String res=JOptionPane.showInputDialog("Desexa calcular máis notas?(non> para cerrar)");
            String resop="non";
            
            if (res==resop){x=0;}
            else {x=1;}
            ;
            
            

        } while (x == 1);
    }

}
