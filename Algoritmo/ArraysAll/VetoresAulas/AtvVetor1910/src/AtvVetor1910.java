import javax.swing.JOptionPane;

public class AtvVetor1910 {
    public static void main(String[] args) throws Exception {
        
        String mes[];
        mes = new String[12];
        int escolha;

        mes[0]="Janeiro";
        mes[1]="Fevereiro";
        mes[2]="Março";
        mes[3]="Abril";
        mes[4]="Maio";
        mes[5]="Junho";
        mes[6]="Julho";
        mes[7]="Agosto";
        mes[8]="Setembro";
        mes[9]="Outubro";
        mes[10]="Novembro";
        mes[11]="Dezembro";

        escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número do mês."));

        if(escolha >= 0 && escolha <1){

            JOptionPane.showMessageDialog(null,  "O mês escolhido foi: " + mes[escolha-1] + ".");

        }
            else{

                JOptionPane.showMessageDialog(null,  "O número não corresponde a nenhum mês.");

            }

        
    }
}
