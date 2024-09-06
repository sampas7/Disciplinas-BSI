import java.util.List;
import java.util.ArrayList;

public class Aluno {

    private String nome;
    private List <Matricula> matriculas;
    
    public Aluno (String nome){
        this.nome = nome;
        this.matriculas = new ArrayList <>();
    
    }
    
    public String getNome(){
        return nome;
        
    }
    
    public void adicionarMatricula(Matricula matricula){
        matriculas.add(matricula);
        
    }
    
    public double getNota(String nomeDisciplina){
        for(Matricula matricula:matriculas){
            if(matricula.getDisciplina().getNome().equalsIgnoreCase(nomeDisciplina))
            {
                return matricula.getNota();
            }
        }
        return 0.0;
    }
}
