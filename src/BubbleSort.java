public class BubbleSort {
    
    static class Estatisticas {
        int comparacoes;
        int movimentacoes;
        int iteracoes;
        
        Estatisticas(int comp, int mov, int iter) {
            this.comparacoes = comp;
            this.movimentacoes = mov;
            this.iteracoes = iter;
        }
    }
    
    public static Estatisticas ordenar(int tamanho, int[] vetor) {
        int temp = 0;
        boolean trocou = true;
        int comp = 0;
        int mov = 0;
        int iter = 0;
        
        for (int i = 0; i < tamanho && trocou; i++) {
            trocou = false;
            for (int j = 1; j < tamanho - i; j++) {
                iter++;
                comp++;
                if (vetor[j - 1] > vetor[j]) {
                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                    mov += 3;
                    trocou = true;
                }
            }
        }
        return new Estatisticas(comp, mov, iter);
    }
}