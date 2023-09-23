package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        double valor,resul;

        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor."));

        if (valor%2 == 0){

            resul = valor*valor;
            JOptionPane.showMessageDialog(null, "Esse número é par e o quadrado dele é "+resul);

        }

            if (valor%2 != 0){

                resul = valor*valor*valor;
                JOptionPane.showMessageDialog(null, "Esse número é ímpar e o cubo dele é "+resul);
            }

    }
}
