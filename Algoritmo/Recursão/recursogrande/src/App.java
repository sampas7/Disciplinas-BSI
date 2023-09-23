import javax.swing.JOptionPane;

public class App {

    public static double multR(int n){

        if (n > 0) {

            return (double) 1/n + App.multR(n - 1);
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        
        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número."));
        
        JOptionPane.showMessageDialog(null, "O resultado é " + App.multR(n1));


    }
}
