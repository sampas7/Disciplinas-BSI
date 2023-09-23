package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int ano;

        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano."));
        
        if ((ano%4==0) && (ano%100!=0)){

            JOptionPane.showMessageDialog(null, "O ano é bissexto.");

        }

            else{

                JOptionPane.showMessageDialog(null, "O ano não é bissexto.");
                
            }

    }
}
