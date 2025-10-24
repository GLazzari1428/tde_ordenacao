public class CombSort {
    
    static class Estatisticas {
        int comparacoes;
        int movimentacoes;
        
        Estatisticas(int comp, int mov) {
            this.comparacoes = comp;
            this.movimentacoes = mov;
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
        
        while (sorted == 0) {
            gap = (int) Math.floor(gap / 1.3);
            if (gap <= 1) {
                gap = 1;
                sorted = 1;
            }
            
            for (i = 0; i < n - gap; i++) {
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
        return new Estatisticas(comp, mov);
    }
}
