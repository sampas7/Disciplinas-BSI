import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] vetor = new int [2][2];

        vetor [0][0] = 0;
        vetor [0][1] = 1;
        vetor [1][0] = 2;
        vetor [1][1] = 3;
        vetor [2][0] = 4;
        vetor [2][1] = 5;
        
        //int [][] t = {{0,0},{1,1}};

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            JOptionPane.showMessageDialog(null, "número " + i + " " + j + " = " + vetor[i][j]);

        }
        }
    }
}
