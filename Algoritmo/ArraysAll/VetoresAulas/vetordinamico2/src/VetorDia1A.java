import javax.swing.JOptionPane;

public class VetorDia1A {
    public static void main(String[] args) throws Exception {
        
        int vetor[][], linha=2, coluna=2;
        vetor = new int[linha][coluna];
        String mostrar="";

        for(int i=0;i<2;i++){
           for(int k=0;k<2;k++){

            vetor[i][k]=i;

            }
        }

        for(int j=0;j<2;j++){
            for(int x=0;x<2;x++){

                mostrar = mostrar + vetor[j][x];

            }
        }

            JOptionPane.showMessageDialog(null, mostrar);
    }
}
