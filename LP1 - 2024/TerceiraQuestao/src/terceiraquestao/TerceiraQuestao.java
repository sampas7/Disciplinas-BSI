
package terceiraquestao;

import javax.swing.JOptionPane;


public class TerceiraQuestao {
    
    public static void main(String[] args) {
        
        Dat3 d1 = new Dat3(14,6,2024);
        
        JOptionPane.showMessageDialog(null, "Data atual: " + d1.displayDate());        
    }
    
}
