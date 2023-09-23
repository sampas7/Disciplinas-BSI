import javax.swing.JOptionPane;

public class App {

    public static double massac(double massa, double altura){

        double massacor;
        massacor = massa/(altura*altura);
        return massacor;
    }
    public static void main(String[] args) throws Exception {


        double massa1, altura1;
        
        massa1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso."));

        

        altura1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura."));

        JOptionPane.showMessageDialog(null, "Seu índice de massa corporal é: " + (massac(massa1, altura1)));

    }
}
