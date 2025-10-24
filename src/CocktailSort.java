public class CocktailSort {
    
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
        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temp;
        int comp = 0;
        int mov = 0;
        int iter = 0;
        
        while (trocou) {
            trocou = false;
            
            for (int i = inicio; i < fim; i++) {
                iter++;
                comp++;
                if (vetor[i] > vetor[i + 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    mov += 3;
                    trocou = true;
                }
            }
            
            if (!trocou) {
                break;
            }
            
            trocou = false;
            fim--;
            
            for (int i = fim; i > inicio; i--) {
                iter++;
                comp++;
                if (vetor[i] < vetor[i - 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                    mov += 3;
                    trocou = true;
                }
            }
            
            inicio++;
        }
        return new Estatisticas(comp, mov, iter);
    }
}