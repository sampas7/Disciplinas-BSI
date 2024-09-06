import java.util.ArrayList;

public class Lista {

    private Aluno[] alunos = new Aluno[3];
    private int totalAlunos = 0;

    private void garantaEspaco() {
        if (this.totalAlunos == this.alunos.length) {
            Aluno[] novaArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novaArray[i] = this.alunos[i];

            }
            this.alunos = novaArray;

        }
    }

    public void adiciona(Aluno aluno) {
        this.garantaEspaco();
        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos++;

    }

    public void adiciona(int posicao, Aluno aluno) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicão Inválida.");

        }

        for (int i = this.totalAlunos - 1; i >= posicao; i--) {
            this.alunos[i + 1] = this.alunos[i];

        }

        this.alunos[posicao] = aluno;
        this.totalAlunos++;

    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalAlunos;

    }

    public Aluno pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida.");

        }
        return this.alunos[posicao];

    }

    private boolean posicaoOcupada(int posicao) {
        return posicao > 0 && posicao < this.totalAlunos;

    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicão inválida.");

        }

        for (int i = posicao; i < this.totalAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];

        }

        this.totalAlunos--;

    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalAlunos; i++) {
            if (aluno.equals(alunos[i]))
                return true;
        }

        return false;

    }

    public int tamanho() {
        return this.totalAlunos;

    }

    public String toString() {
        if (this.totalAlunos == 0) {
            return "[]";

        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");

        }

        builder.append(this.alunos[this.totalAlunos - 1]);
        builder.append("]");

        return builder.toString();
    }

    public String toString2() {
        if (totalAlunos == 0) {
            return "[]";

        }
        String retorno;
        retorno = "[";

        for (int i = 0; i < totalAlunos - 1; i++) {
            retorno += alunos[i] + ", ";

        }

        retorno += alunos[totalAlunos - 1] + "]";

        return retorno;

    }

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);

        int tamanho = lista.size();

        if (tamanho != 3) {
            System.out.println("Erro: O tamanho da lista está errado.");

        }

        if (!lista.contains(aluno1)) {
            System.out.println("Erro: Não achou um aluno que deveria estar na lista.");

        }

        lista.remove(0);
        tamanho = lista.size();

        if (tamanho != 2) {
            System.out.println("Erro: O tamanho da lista está errado");

        }

        if (lista.contains(aluno3)) {
            System.out.println("Erro: Achou um aluno que não deveria estar na lista.");

        }

    }

    /*
     * Aluno a1 = new Aluno("Rafael", 22, 8, "III Semestre");
     * Aluno a2 = new Aluno("Bernardo");
     * Aluno a3 = new Aluno("José");
     * Aluno a4 = new Aluno("Sampas", 19, 4, "III Semestre");
     * Aluno a5 = new Aluno("Voce Sabe", 20, 10, "III Semestre");
     * Aluno a6 = new Aluno("Rick", 19, 9, "III Semestre");
     * Aluno a7 = new Aluno("Show", 23, 8, "V Semestre");
     * 
     * Lista lista = new Lista();
     * lista.adiciona(a1);
     * lista.adiciona(a2);
     * lista.adiciona(a3);
     * lista.adiciona(a4);
     * lista.adiciona(a5);
     * lista.adiciona(a6);
     * lista.adiciona(a7);
     * 
     * System.out.println(lista);
     * System.out.println(lista.tamanho());
     * 
     * try {
     * 
     * lista.remove(20);
     * System.out.println(lista);
     * System.out.println(lista.tamanho());
     * 
     * } catch (Exception x) {
     * System.out.println("Posicão não está ocupada: " + x);
     * 
     * } finally {
     * System.out.println("Certamente rodou o programa.");
     * }
     * 
     */

    /*
     * if(lista.contem(a1))
     * System.out.println("Sim");
     * else
     * System.out.println("Não");
     * 
     * Aluno b;
     * try {
     * 
     * b = lista.pega(5);
     * System.out.println(b.getNome());
     * 
     * } catch (Exception e){
     * System.out.println("Aluno não existe");
     * 
     * }
     */

    /*
     * if(b == null)
     * System.out.println("Aluno não existe");
     * else
     * System.out.println(b.getNome());
     */

}