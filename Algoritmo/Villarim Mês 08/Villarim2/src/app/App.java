package app;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        double saldo,deb,cred,fim;

        saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu saldo."));
        deb = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o débito que será feito."));
        cred = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o crédito que será feito."));


        fim = saldo+cred-deb;
        

            if (fim >= saldo){
                
                JOptionPane.showMessageDialog(null, "Saldo positivo em R$"+fim);

            }
                if (fim < saldo && fim != 0) {

                JOptionPane.showMessageDialog(null, "Saldo negativo em R$"+fim);

                
                }


            if (fim == 0){

                JOptionPane.showMessageDialog(null, "Saldo zero.");

            }



    }
}
