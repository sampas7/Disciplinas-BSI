import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int nota[];
        nota = new int[3];
        int soma=0;
        
        String sNota="";

        for(int i=0;i<3;i++){

            sNota = JOptionPane.showInputDialog(null, "Qual a nota?");

            soma = soma + nota[1];
        
        }
        
        for(int j=0;j<3;j++){

            JOptionPane.showMessageDialog(null, nota[j]+"\n");
            
        }

        
        
    }
}
