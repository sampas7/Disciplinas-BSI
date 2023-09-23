import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)  {
        int num1,num2, soma;
        String resposta = "s";

        resposta = JOptionPane.showInputDialog(null, "Você quer fazer uma soma?");

        while(resposta.equals("s")){

            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número."));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número."));

            soma = num1 + num2;
            JOptionPane.showMessageDialog(null, soma);
            resposta = JOptionPane.showInputDialog(null, "Continuar (s)?");
        }

        
    }
}
