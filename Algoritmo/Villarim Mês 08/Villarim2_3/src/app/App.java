package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int dia, idd;
        double preço, valorf, valort2, valort1;

        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número referente ao dia da semana.\n1: Domingo.\n2: Segunda.\n3: Terça.\n4: Quarta.\n5: Quinta.\n6: Sexta.\n7: Sábado."));
            idd = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade."));
            preço = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço do ingresso."));

        switch (dia){

            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                if (idd < 14){

                    valorf = 0.5*preço;
                    JOptionPane.showMessageDialog(null, "O valor a pagar é R$"+valorf);
                    
                }

                    else{

                        JOptionPane.showMessageDialog(null, "O valor a pagar é R$"+preço);

                    }
                break;

            case 3:
                if (idd < 14){
                    
                    valort1 = 0.5*preço;
                    valort2 = 0.5*valort1;
                    JOptionPane.showMessageDialog(null, "O valor a pagar é R$"+valort2);

                }   
                
                    else {

                        valort1 = 0.5*preço;
                        JOptionPane.showMessageDialog(null, "O valor a pagar é R$"+valort1);

                    }
                    break;

            default:
                JOptionPane.showMessageDialog(null, "Dia da semana inexistente, Informe um número entre 1 a 7 referente ao dia da semana.");
        }    
    }
}
