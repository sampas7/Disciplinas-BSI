import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double conta[][] = new double [3][6];

        for(int i=0;i<2;i++){
            for(int j=0;j<6;j++)

                conta[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os gastos de energia do " + (j+1) + "º mês do " + (i+1) + "º ano."));


                for(int k=0;k<6;k++){

                    JOptionPane.showMessageDialog(null, );

                }
            }
            


        }




    }
}
