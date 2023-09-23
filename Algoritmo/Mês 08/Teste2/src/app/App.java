package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        int idd, res;

        idd = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade."));

        res = 18-idd;
            
            if (idd>=18){

                JOptionPane.showMessageDialog(null, "Você é maior de idade.");

            }

                else{

                    JOptionPane.showMessageDialog(null, "Você é menor de idade. Ainda faltam "+res+" anos para ser maior.");

                }

    }

}
