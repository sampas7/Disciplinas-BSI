import javax.swing.JOptionPane;

public class Q4V {
    public static void main(String[] args) throws Exception {
        
        double num[] = new double[20];
        String mostrar="";

        for(int a=0; a < 20; a++){

            num[a] = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o " + (a + 1) + "º número?"));

            if(num[a] % 2 != 0){

                mostrar += num[a] + " ";
            }

        }

        JOptionPane.showMessageDialog(null, mostrar);
    }
}
