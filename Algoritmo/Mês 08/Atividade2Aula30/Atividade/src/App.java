//essa é a questão 2.

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)  {

        String relatorio, func="", nome="", end="", tel="", mostrar="";

        int cont, nfun;
        

        for(cont=0;cont < 3;cont++){

            nome = JOptionPane.showInputDialog(null, "Nome: ");
            end = JOptionPane.showInputDialog(null, "Endereço: ");
            tel = JOptionPane.showInputDialog(null, "Telefone: ");

            mostrar = mostrar + nome + "\n" + end + "\n" + tel + "\n\n";

        }

        relatorio = JOptionPane.showInputDialog(null, "Visualizar relatório? (s/n) ");

        while (relatorio.equals("s")){

            JOptionPane.showMessageDialog(null, mostrar);
            relatorio = JOptionPane.showInputDialog(null, "Visualizar relatório novamente? (s/n) ");
            

        }



    

        

    }
}
