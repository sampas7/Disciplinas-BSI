import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args){
        Aluno aluno = new Aluno("Sampas");
        
        Disciplina matematica = new Disciplina("Matematica");

        Matricula matriculaMath = new Matricula(aluno, matematica, 9.0);
        
        aluno.adicionarMatricula(matriculaMath);
        
        /*System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota em: " + matematica.getNome() + " = " + aluno.getNota(matematica.getNome()));*/
        
        JOptionPane.showMessageDialog(null, "Nome: " + aluno.getNome() + "\nNota em " + matematica.getNome() + ": " + aluno.getNota(matematica.getNome()));
   }
}
