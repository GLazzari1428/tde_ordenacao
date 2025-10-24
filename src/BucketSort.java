public class BucketSort {
    
    static class Estatisticas {
        int comparacoes;
        int movimentacoes;
        
        Estatisticas(int comp, int mov) {
            this.comparacoes = comp;
            this.movimentacoes = mov;
        }
    }
    
    public static Estatisticas ordenar(int[] vetor, int tamanho) {
        int comp = 0;
        int mov = 0;
        
        if (tamanho == 0) {
            return new Estatisticas(comp, mov);
        }
        
        // encontrar min e max
        int min = vetor[0];
        int max = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] < min) min = vetor[i];
            if (vetor[i] > max) max = vetor[i];
        }
        
        if (max == min) {
            return new Estatisticas(comp, mov);
        }
        
        int M = 10;
        int div = (max - min) / M;
        if (div == 0) div = 1;
        
        // criar buckets
        int[][] buckets = new int[M][tamanho];
        int[] bucketSizes = new int[M];
        
        // distribuir elementos nos buckets
        for (int i = 0; i < tamanho; i++) {
            int bucketIndex = (vetor[i] - min) / div;
            if (bucketIndex < 0) bucketIndex = 0;
            else if (bucketIndex >= M) bucketIndex = M - 1;
            
            buckets[bucketIndex][bucketSizes[bucketIndex]] = vetor[i];
            bucketSizes[bucketIndex]++;
            mov++;
        }
        
        // ordenar cada bucket com insertion sort e copiar de volta
        int index = 0;
        for (int i = 0; i < M; i++) {
            if (bucketSizes[i] > 0) {
                // insertion sort no bucket
                for (int j = 1; j < bucketSizes[i]; j++) {
                    int key = buckets[i][j];
                    int k = j - 1;
                    
                    while (k >= 0) {
                        comp++;
                        if (buckets[i][k] > key) {
                            buckets[i][k + 1] = buckets[i][k];
                            mov++;
                            k--;
                        } else {
                            break;
                        }
                    }
                    buckets[i][k + 1] = key;
                    mov++;
                }
                
                // copiar de volta para o vetor original
                for (int j = 0; j < bucketSizes[i]; j++) {
                    vetor[index] = buckets[i][j];
                    index++;
                    mov++;
                }
            }
        }
        
        return new Estatisticas(comp, mov);
    }
}
