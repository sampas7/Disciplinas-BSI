import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
       
        int contador = 0;
        String numero="";

        do{
            
            numero = numero + contador;
            contador = contador + 1;

        }while(contador < 10);

        JOptionPane.showMessageDialog(null, numero);
    }
}
