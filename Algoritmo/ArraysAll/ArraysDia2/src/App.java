import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double vinte[];
        vinte = new double[6];
        double vinteum[];
        vinteum = new double[6];
        double soma[];
        soma = new double[6];

        

        for (int i=0;i<6;i++){

            vinte[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os gastos de energia do " + (i+1) + "º mês de 2020."));

        }

        for (int j=0;j<6;j++){

            vinteum[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os gastos de energia do " + (j+1) + "º mês de 2021."));

        }

        for (int k=0;k<6;k++){

            soma[k] = vinte[k] + vinteum[k];


        }

  

            JOptionPane.showMessageDialog(null, "O gasto de janeiro foi " + soma[0] + "\nO gasto de fevereiro foi " + soma[1] + "\nO gasto de março foi " + soma[2] + "\nO gasto de abril foi " + soma[3] + "\nO gasto de maio foi " + soma[4] + "\nO gasto de junho foi " + soma[5]);
        
    }
}
