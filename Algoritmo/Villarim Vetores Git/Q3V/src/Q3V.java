import javax.swing.JOptionPane;

public class Q3V {
    public static void main(String[] args) throws Exception {

        int num[] = new int [20];
        String mostrar="", mostrar2 ="", mostrar3 ="";

        for ( int a = 0; a < 20; a++){

            num[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o " + (a + 1) + "º número?"));

            mostrar += num[a] + " ";
            
        }

        for (int b = 19; b >= 0; b--){

            mostrar2 += num[b] + " ";

        } 

        for(int c = 0; c < 20; c++){

            mostrar3 =" Ordem de entrada = " + mostrar2 + "\nOrdem contrária = " + mostrar;

        }

        JOptionPane.showMessageDialog(null, mostrar3);
    }
}
