import java.util.LinkedList;

public class Pilha<T> {

    private LinkedList<T> objetos = new LinkedList<T>();

    public void insere(T t) {
        this.objetos.add(t);
    }

    public T remove() {
        return this.objetos.remove(this.objetos.size() - 1);
    }

    public boolean vazia() {
        return this.objetos.size() == 0;
    }

    public String toString(){
        return objetos.toString();
    }

    public static void main(String[] args) {
        Peca p1 = new Peca("Sampeça");
        Peca p2 = new Peca("Samparafuso");

        Pilha<Peca> pilha = new Pilha<Peca>();
        pilha.insere(p1);
        pilha.insere(p2);
        System.out.println(pilha);

        Peca x = pilha.remove();
        System.out.println(x);
        System.out.println(pilha);

        Pilha<Character> p = new Pilha<Character>();
        p.insere('a');
        p.insere('B');
        System.out.println(p);
        System.out.println(p.remove());
        System.out.println(p.remove());

        Pilha<Integer> pi = new Pilha<Integer>();
        pi.insere('1');
        pi.insere('2');
        System.out.println(pi.remove());
    }
}
