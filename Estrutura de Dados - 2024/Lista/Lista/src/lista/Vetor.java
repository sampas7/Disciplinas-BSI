public class Vetor {

    private Object[] objetos = new Object[1];
    
    private int totalDeObjetos = 0;
    
    private void garantaEspaco() {
        if (this.totalDeObjetos == this.objetos.length) {
            Object[] novaArray = new Aluno[this.objetos.length * 2];
            for (int i = 0; i < this.objetos.length; i++) {
                novaArray[i] = this.objetos[i];

            }
            this.objetos = novaArray;

        }
    }
    
    public void adiciona(Aluno aluno) {
        this.garantaEspaco();
        this.objetos[this.totalDeObjetos] = aluno;
        this.totalDeObjetos++;

    }
    
    public void adiciona(int posicao, Aluno aluno){
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Poiscao invalida.");
        }
        
        for (int i = this.totalDeObjetos - 1; i >= posicao; i--){
            this.objetos[i + 1] = this.objetos[i];
        }
        
        this.objetos[posicao] = aluno;
        this.totalDeObjetos++;
        
    }
    
    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= this.totalDeObjetos;
        
    }
    
    public Object pega(int posicao){
        if (!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao invalida.");
        }
        return this.objetos[posicao];
        
    }
    
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeObjetos;
        
    }
    
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao invalida.");

        }

        for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];

        }

        this.totalDeObjetos--;

    }
    
    public boolean contem(Aluno objeto){
        for (int i = 0; i < totalDeObjetos; i++) {
            if (objeto.equals(objetos[i]))
                return true;
        }

        return false;
        
    }
    
    @Override
    public String toString() {
        if (this.totalDeObjetos == 0) {
            return "[]";

        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalDeObjetos - 1; i++) {
            builder.append(this.objetos[i]);
            builder.append(", ");

        }

        builder.append(this.objetos[this.totalDeObjetos - 1]);
        builder.append("]");

        return builder.toString();
    }
    
    public String toString2() {
        if (totalDeObjetos == 0) {
            return "[]";

        }
        String retorno;
        retorno = "[";

        for (int i = 0; i < totalDeObjetos - 1; i++) {
            retorno += objetos[i] + ", ";

        }

        retorno += objetos[totalDeObjetos - 1] + "]";

        return retorno;

    }
    
    public int tamanho(){
        return this.totalDeObjetos;
    
}
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Aluno 1", 22, 8, "III Semestre");
        Aluno a2 = new Aluno("Aluno 2");
        Aluno a3 = new Aluno("Aluno 3");
        Aluno a4 = new Aluno("Aluno 4", 25, 9, "V Semestre");
        Aluno a5 = new Aluno("Aluno 5", 22, 8, "VII Semestre");
                
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        System.out.println(lista);
        System.out.println(lista.objetos.length);
        
        lista.adiciona(0, a4);
        lista.adiciona(1, a3);
        lista.adiciona(a5);
        System.out.println(lista);
        System.out.println(lista.objetos.length);
        
        lista.remove(0);
        System.out.println(lista);
        System.out.println(lista.objetos.length);
        
    }
}
