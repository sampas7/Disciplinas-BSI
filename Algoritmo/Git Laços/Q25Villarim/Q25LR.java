import javax.swing.JOptionPane;

public class Q25LR {

    public static int euclides1(int p, int q) {
        if (q == 0) return p;
        else return euclides1(q, p % q);
    }


    public static int euclides2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número."));
        int q = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número."));
        int d  = euclides1(p, q);

        JOptionPane.showMessageDialog(null, "O resultado do algoritmo de Euclides de (" + p + ", " + q + ") é: " + d);
    }
}
