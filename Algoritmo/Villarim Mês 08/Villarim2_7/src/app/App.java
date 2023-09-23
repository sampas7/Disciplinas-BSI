package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)  {
        double nota1,nota2,nota3,nota4,med;
        String nome;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota."));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota."));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a terceira nota."));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quarta nota."));
        nome = JOptionPane.showInputDialog(null, "Informe o nome do discente.");

        med = (nota1+nota2+nota3+nota4)/4;

        if (med >=6){

            JOptionPane.showMessageDialog(null, nome+" está aprovado(a).");

        }

            else{

                JOptionPane.showMessageDialog(null, nome+" está reprovado(a).");

            }

    }
}
