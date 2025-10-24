public class SelectionSort {
    
    static class Estatisticas {
        int comparacoes;
        int movimentacoes;
        
        Estatisticas(int comp, int mov) {
            this.comparacoes = comp;
            this.movimentacoes = mov;
        }
    }
    
    public static Estatisticas ordenar(int tamanho, int[] vetor) {
        int comp = 0;
        int mov = 0;
        
        for (int i = 0; i < tamanho - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tamanho; j++) {
                comp++;
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                mov += 3;
            }
        }
        return new Estatisticas(comp, mov);
    }
}
