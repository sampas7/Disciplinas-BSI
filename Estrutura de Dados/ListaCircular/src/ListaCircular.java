public class ListaCircular {

    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos = 0;

    public ListaCircular() {
        primeira = null;
        ultima = null;
        totalDeElementos = 0;
    }

    /* 4.2 - Tamanho */
    public int tamanho() {
        return this.totalDeElementos;
    }

    /* 4.3 Adiciona no final */
    public void adiciona(Object elemento) {

        Celula nova = new Celula(elemento);

        // 01 - Lista Vazia
        if (this.totalDeElementos == 0) {
            this.primeira = nova;
            this.ultima = nova;
            nova.setProxima(nova);
            nova.setAnterior(nova);
        } else {
            nova.setProxima(primeira);
            primeira.setAnterior(nova);
            ultima.setProxima(nova);
            nova.setAnterior(ultima);
            ultima = nova;
        }
        totalDeElementos++;
    }

    /* 4.4 Remove no final */
    public void remove() {
        // lista vazia
        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("Posicao nao existe");
        }

        // lista com 1 elemento
        else if (this.totalDeElementos == 1) {
            primeira.setProxima(null);
            primeira.setAnterior(null);
            primeira = null;
            ultima = null;
        } else { // lista com mais de 1 elemento
            Celula penultima = ultima.getAnterior();
            penultima.setProxima(primeira);
            primeira.setAnterior(penultima);
            ultima = penultima;
        }

        totalDeElementos--;
    }

    /* 4.5 - Concatena */
    public void concatena(ListaCircular L2) {
        // 01 - L1 Vazia e L2 Vazia
        if (this.totalDeElementos == 0 & L2.totalDeElementos == 0) {
            // Nada é feito
        }

        // 02 - L1 Cheia e L2 Vazia
        else if (this.totalDeElementos > 0 & L2.totalDeElementos == 0) {
            // Nada é feito
        }

        // 03 - L1 Vazia e L2 Cheia
        else if (this.totalDeElementos == 0 & L2.totalDeElementos > 0) {

            this.primeira = L2.primeira;
            this.ultima = L2.ultima;
            this.totalDeElementos = L2.totalDeElementos;

        }

        // 04 - L1 Cheia e L2 Cheia
        else if (this.totalDeElementos > 0 & L2.totalDeElementos > 0) {

            this.ultima.setProxima(L2.primeira);
            L2.primeira.setAnterior(this.ultima);

            L2.ultima.setProxima(this.primeira);
            this.primeira.setAnterior(L2.ultima);

            this.ultima = L2.ultima;
            this.totalDeElementos += L2.totalDeElementos;
        }
    }

    /* 4.6 - Intercalar lista - Cria uma nova lista, após isso, copia para L1 */
    public void intercalaLista(ListaCircular L2) {
        // 01 - L1 Vazia e L2 Vazia
        if (this.totalDeElementos == 0 & L2.totalDeElementos == 0) {
            // Nada é feito
        }

        // 02 - L1 Cheia e L2 Vazia
        else if (this.totalDeElementos > 0 & L2.totalDeElementos == 0) {
            // Nada é feito
        }

        // 03 - L1 Vazia e L2 Cheia
        else if (this.totalDeElementos == 0 & L2.totalDeElementos > 0) {

            this.primeira = L2.primeira;
            this.ultima = L2.ultima;
            this.totalDeElementos = L2.totalDeElementos;

        }

        // 04 - L1 Cheia e L2 Cheia
        else if (this.totalDeElementos > 0 & L2.totalDeElementos > 0) {

            // pega a primeira de L1
            // pega a primeira de L2

            // do while - enquanto não é a primeira
            // -> adicionar L3 o atual L1
            // -> pula para próxima de L1 e L2

            // se ainda existe elementos em L1
            // -> adiciona os elementos de L1 em L3

            // se ainda existe elementos em L2
            // -> adiciona os elementos de L2 em L3

            // copiar para L1 o resultado de L3

        }

    }

    /* 4.7 - Imprimir lista */
    public String toString() {
        // Lista vazia
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;

        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }

        // último elemento
        builder.append(atual.getElemento());
        builder.append("]");

        return builder.toString();
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Sampas");
        Aluno a2 = new Aluno("Bernard");
        Aluno a3 = new Aluno("Lauren");

        // Lista implementada
        ListaCircular l1 = new ListaCircular();
        l1.adiciona(a1);
        l1.adiciona(a2);
        l1.adiciona(a3);
        System.out.println(l1);

        Aluno b1 = new Aluno("Sampas/L2");
        Aluno b2 = new Aluno("Bernard/L2");
        Aluno b3 = new Aluno("Lauren/L2");

        // Lista implementada

        ListaCircular l2 = new ListaCircular();
        l2.adiciona(b1);
        l2.adiciona(b2);
        l2.adiciona(b3);
        System.out.println(l2);

        l2.concatena(l1);
        System.out.println(l2);
        System.out.println(l2.tamanho());

        /*
         * lista.remove();
         * System.out.println(lista);
         */

    }
}
