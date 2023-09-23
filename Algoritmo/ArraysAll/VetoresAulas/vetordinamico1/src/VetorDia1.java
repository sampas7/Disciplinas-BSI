import javax.swing.JOptionPane;

public class VetorDia1 {
    public static void main(String[] args) throws Exception {

        int vetor[], tamanho=10;
        vetor = new int[tamanho];
        String mostrar="";

        for(int i=0;i<tamanho;i++){
            
            vetor[i] =i;

        }

        for(int j=0;j<tamanho;j++){


            mostrar = mostrar+vetor[j];


        }

        JOptionPane.showMessageDialog(null, mostrar);

    }
}
