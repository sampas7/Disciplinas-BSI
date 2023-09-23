public class ObjMain{

    private String nome;
    private int idade;
    private float nota;
    private String turma;

    //Construtor vazio
    public ObjMain(){
    
    }
    
    //Construtor passando nome
    public ObjMain(String nome) {
        this.nome = nome;
    }

    //Construtor passando dados
    public ObjMain(String nome, int idade, float nota, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.turma = turma;
    }

    //toString
    public String toString() {
        return this.getNome() + " - " + this.turma;
    }
     
     //equals
     public boolean equals(ObjMain outro) {
        
         return this.nome.equals(outro.getNome());
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

    
public static void main(String[] args) throws Exception{
    
    }
}