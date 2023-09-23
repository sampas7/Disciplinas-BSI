import javax.swing.JOptionPane;

public class Atv2Vetor1910 {
    public static void main(String[] args) throws Exception {
    
        int nums, res=0;

        nums = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números irá usar?"));

        int media[] = new int[nums];

        for(int a=0;a<nums;a++){

            media[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (a+1) + "º número."));
            res = res + media[a];

            }

            res = res/nums;
            JOptionPane.showMessageDialog(null, "A média desses números é " + res + ".");
        }


    }
