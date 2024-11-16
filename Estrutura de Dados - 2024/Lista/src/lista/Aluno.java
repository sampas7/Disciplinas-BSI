public class Aluno {

    private String nome;
    private int idade;
    private float nota;
    private String turma;

    //Construtor vazio
    public Aluno(){
    
    }
    
    //Construtor passando nome
    public Aluno(String nome) {
        this.nome = nome;
    }

    //Construtor passando dados
    public Aluno(String nome, int idade, float nota, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.turma = turma;
    }

    //toString
    @Override
     public String toString() {
        return this.getNome();
    }
     
     //equals
     public boolean equals(Aluno outro) {
        
         return this.nome.equals( outro.getNome());
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    public static void main(String[] args) {
        
    }
    
}
