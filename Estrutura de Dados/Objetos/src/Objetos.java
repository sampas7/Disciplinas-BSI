public class Objetos {

    private ObjMain[] objetos = new ObjMain[3];
    private int totalDeObjetos = 0;

    private void garantaEspaco() {
        if (this.totalDeObjetos == this.objetos.length) {
            ObjMain[] novaArray = new ObjMain[this.objetos.length * 2];
            for (int i = 0; i < this.objetos.length; i++) {
                novaArray[i] = this.objetos[i];

            }
            this.objetos = novaArray;
        }
    }

    public void adiciona(ObjMain obj) {
        this.garantaEspaco();
        this.objetos[this.totalDeObjetos] = obj;
        this.totalDeObjetos++;

    }

    public void adiciona(int posicao, ObjMain obj) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicão Inválida.");

        }

        for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
            this.objetos[i + 1] = this.objetos[i];

        }

        this.objetos[posicao] = obj;
        this.totalDeObjetos++;

    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeObjetos;

    }

    public ObjMain pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicão Inválida");
        }
        return this.objetos[posicao];

    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicão Inválida");
        }
        for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];
        }
        this.totalDeObjetos--;

    }

    // Exercício 7 - Lista - Remove objetos iguais encontrados.

    public void removeObj(Object obj) {
        int i = 0;
        while (i < this.totalDeObjetos) {
            if (obj.equals(objetos[i])) {
                remove(i);
            }

            else {
                i++;
            }

        }

    }

    // Exercício 8 - Lista - Limpar todo o array.

    public void clear() {

        totalDeObjetos = 0;

        // Alternativa usando while:

        /*
         * int i = 0;
         * while (i < this.totalDeObjetos) {
         * remove(i);
         * 
         * }
         */

    }

    // Exercício 11 - Lista - Localiza index da ocorrência passada

    /*
     * public int indexOf(Object obj, int ocorr){
     * int posRetorno = -1;
     * int quant = 0;
     * 
     * for (int i=0; i<totalDeObjetos; i++){
     * if(obj.equals(objetos[i])){
     * quant++; // Contador de ocorrência do objeto
     * 
     * if(quant == ocorr){ // já chegou na ocorrência desejada?
     * posRetorno = i; // pega a posicão do objeto
     * break;
     * }
     * }
     * 
     * if (posRetorno == -1){
     * throw new IllegalArgumentException("Posicao nao encontrada.");
     * }
     * else{
     * return posRetorno;
     * }
     * }
     * 
     * }
     */

    // Verificar quantidade de ocorrências

    /*
     * public int QuantOcorrencia(Object obj){
     * int quant = 0;
     * 
     * for(int i=0; i<totalDeObjetos; i++){
     * if(obj.equals(objetos[i])){
     * quant++;
     * 
     * }
     * return quant;
     * }
     * 
     * }
     */

    public boolean contem(ObjMain obj) {
        for (int i = 0; i < totalDeObjetos; i++) {
            if (obj.equals(this.objetos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeObjetos;

    }

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
        if (this.totalDeObjetos == 0) {
            return "[]";
        }

        String retorno;
        retorno = "[";

        for (int i = 0; i < this.totalDeObjetos - 1; i++) {
            retorno += objetos[i] + ", ";
        }

        retorno += objetos[totalDeObjetos - 1];
        retorno += "]";

        return retorno;

    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeObjetos;

    }

    public int tamanhoArray() {
        return objetos.length;

    }

    public static void main(String[] args) throws Exception {
        ObjMain a1 = new ObjMain("Rafael", 22, 8, "III Semestre");
        ObjMain a2 = new ObjMain("Bernardo");
        ObjMain a3 = new ObjMain("José");
        ObjMain a4 = new ObjMain("Sampas", 19, 4, "III Semestre");
        ObjMain a5 = new ObjMain("Voce Sabe", 20, 10, "III Semestre");
        ObjMain a6 = new ObjMain("Rick", 19, 9, "III Semestre");
        ObjMain a7 = new ObjMain("Show", 23, 8, "V Semestre");

        Objetos lista = new Objetos();
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        lista.adiciona(a5);
        lista.adiciona(a6);
        lista.adiciona(a7);

        System.out.println(lista);
        System.out.println(lista.tamanho());

        try {

            lista.remove(20);
            System.out.println(lista);
            System.out.println(lista.tamanho());

        } catch (Exception x) {
            System.out.println("Posicão não está ocupada: " + x);

        } finally {
            System.out.println("Certamente rodou o programa.");
        }
    }
}
