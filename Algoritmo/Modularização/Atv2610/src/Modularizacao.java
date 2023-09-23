import javax.swing.JOptionPane;

public class Modularizacao {

    public static String isento(String isento){

        String isento1;
        isento1 = "Você está isento do imposto de renda.";
        return isento1;
    }

    public static double seteporcento(double salario1900){

        double salario=0;
        salario = salario1900;
        salario1900 = salario - (salario * 0.075);
        return salario1900;
    }

    public static double onzeporcento(double salario3800){

        double salario=0;
        salario = salario3800;
        salario3800 = salario - (salario * 0.11);
        return salario3800;
    }

    public static double quinzeporcento(double salario5600){

        double salario=0;
        salario = salario5600;
        salario5600 = salario - (salario * 0.15);
        return salario5600;
    }

    public static double vinteseteporcento(double salario7400){

        double salario=0;
        salario = salario7400;
        salario7400 = salario - (salario * 0.275);
        return salario7400;
    }

    public static void main(String[] args) throws Exception {

        double salario;

        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salário."));

        if (salario<0){

            JOptionPane.showMessageDialog(null, "Como assim seu salário é negativo?");

        }

        else if (salario >=0 && salario<1900){

            JOptionPane.showMessageDialog(null, isento(null));
        }

        else if (salario>1899 && salario<3800){

            JOptionPane.showMessageDialog(null, "Seu salário subtraído 7,5% do Imposto de Renda é: " + seteporcento(salario));

        }

        else if (salario>3799 && salario<5600){

            JOptionPane.showMessageDialog(null, "Seu salário subtraído 11% do Imposto de Renda é: " + onzeporcento(salario));

        }

        else if (salario>5599 && salario<7400){

            JOptionPane.showMessageDialog(null, "Seu salário subtraído 15% do Imposto de Renda é: " + quinzeporcento(salario));
            
        }

        else if (salario>7399){

            JOptionPane.showMessageDialog(null, "Seu salário subtraído 27,5% do Imposto de Renda é: " + vinteseteporcento(salario));
            
        }


        

    }
}
