public class Matricula {
    
    private Aluno aluno;
    private Disciplina disp;
    private double nota;
    
    public Matricula(Aluno a, Disciplina d, double n){
        this.aluno = a;
        this.disp = d;
        this.nota = n;
        
    }
    
    public Aluno getAluno(){
        return aluno;
        
    }
    
    /*(public String getDisciplina(){
        return disp.getNome();
    
    }*/
        
    
    
    public Disciplina getDisciplina(){
        return disp;
        
    }
    
    public double getNota(){
        return nota;
        
    }
}
