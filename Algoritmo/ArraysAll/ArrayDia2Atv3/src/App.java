import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int num[] = new int[3];
        int ref, comp;


        for (int i=0;i<3;i++){

            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o " + (i+1) + "º número?"));
   
        }


        ref = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número de referência?"));

        
    }
}
