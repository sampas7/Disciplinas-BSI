import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        int cont=0;
        String c="";

        while(true){

            cont++;

            c = JOptionPane.showInputDialog(null, "Continuar? (s/n)");

            if(c.equals("n"))
                break;
        }

    }
}
