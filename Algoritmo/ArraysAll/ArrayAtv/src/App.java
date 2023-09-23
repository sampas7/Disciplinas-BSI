import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int nota[] = new int[5];
        double media;

        
        for (int i=0;i<5;i++){

            nota[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a " + (i+1) + "º nota?"));


        }

        media = (nota[0] + nota[1] + nota[2] + nota[3] + nota[4])*0.2;

        JOptionPane.showMessageDialog(null, "A média das 5 notas é: " + media);
    }
}
