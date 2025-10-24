public class CombSort {
    
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
    
    public static Estatisticas ordenar(int n, int[] A) {
        int sorted = 0;
        int gap = n;
        int i;
        int sm;
        int aux;
        int comp = 0;
        int mov = 0;
        int iter = 0;
        
        while (sorted == 0) {
            gap = (int) Math.floor(gap / 1.3);
            if (gap <= 1) {
                gap = 1;
                sorted = 1;
            }
            
            for (i = 0; i < n - gap; i++) {
                iter++;
                sm = gap + i;
                comp++;
                if (A[i] > A[sm]) {
                    aux = A[sm];
                    A[sm] = A[i];
                    A[i] = aux;
                    mov += 3;
                    sorted = 0;
                }
            }
        }
        return new Estatisticas(comp, mov, iter);
    }
}