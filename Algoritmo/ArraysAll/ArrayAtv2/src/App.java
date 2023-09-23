import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double valor[];
        valor = new double[5];

        String sValor="";

        for(int i=0;i<5;i++){

            sValor = JOptionPane.showInputDialog(null, "Qual o " + (i+1) + "º número?");

        }

        



    }
}
