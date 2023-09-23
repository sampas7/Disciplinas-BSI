import javax.swing.JOptionPane;

public class Q10V {
    public static void main(String[] args) throws Exception {

        String diff[] = new String [100];
        String mostrar="";


            for(int b = 0; b < 100; b+=2){

                diff[b] = "P";

                mostrar += diff[b] + " ";

                for(int c = 1; c < 2; c+=2){

                    diff[c] = "I";

                    mostrar += diff[c] + " ";

                }

            }

            JOptionPane.showMessageDialog(null, mostrar);

    }
}
