public class GnomeSort {
    
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
    
    public static Estatisticas ordenar(int n, int[] ar) {
        int i = 0;
        int comp = 0;
        int mov = 0;
        int iter = 0;
        
        while (i < n) {
            iter++;
            if (i == 0) {
                i++;
            } else {
                comp++;
                if (ar[i - 1] <= ar[i]) {
                    i++;
                } else {
                    int tmp = ar[i];
                    ar[i] = ar[i - 1];
                    i--;
                    ar[i] = tmp;
                    mov += 3;
                }
            }
        }
        return new Estatisticas(comp, mov, iter);
    }
}