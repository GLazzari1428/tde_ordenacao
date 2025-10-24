public class _Main {
    
    // classe auxiliar
    static class Estatisticas {
        int comparacoes;
        int movimentacoes;
        
        Estatisticas(int comp, int mov) {
            this.comparacoes = comp;
            this.movimentacoes = mov;
        }
    }
    
    // funcao auxiliar para copiar vetor
    static int[] copiarVetor(int[] original) {
        int tamanho = 0;
        for (int i = 0; i < original.length; i++) {
            tamanho++;
        }
        int[] copia = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            copia[i] = original[i];
        }
        return copia;
    }
    
    static void testarAlgoritmos(int[] vetorOriginal, int tamanho) {
        int[] vetor;
        
        // bubble sort
        vetor = copiarVetor(vetorOriginal);
        BubbleSort.Estatisticas statsBubble = BubbleSort.ordenar(tamanho, vetor);
        System.out.println("Bubble Sort - Comp: " + statsBubble.comparacoes + ", Mov: " + statsBubble.movimentacoes);
        
        // selection sort
        vetor = copiarVetor(vetorOriginal);
        SelectionSort.Estatisticas statsSelection = SelectionSort.ordenar(tamanho, vetor);
        System.out.println("Selection Sort - Comp: " + statsSelection.comparacoes + ", Mov: " + statsSelection.movimentacoes);
        
        // cocktail sort
        vetor = copiarVetor(vetorOriginal);
        CocktailSort.Estatisticas statsCocktail = CocktailSort.ordenar(tamanho, vetor);
        System.out.println("Cocktail Sort - Comp: " + statsCocktail.comparacoes + ", Mov: " + statsCocktail.movimentacoes);
        
        // gnome sort
        vetor = copiarVetor(vetorOriginal);
        GnomeSort.Estatisticas statsGnome = GnomeSort.ordenar(tamanho, vetor);
        System.out.println("Gnome Sort - Comp: " + statsGnome.comparacoes + ", Mov: " + statsGnome.movimentacoes);
        
        // comb sort
        vetor = copiarVetor(vetorOriginal);
        CombSort.Estatisticas statsComb = CombSort.ordenar(tamanho, vetor);
        System.out.println("Comb Sort - Comp: " + statsComb.comparacoes + ", Mov: " + statsComb.movimentacoes);
        
        // bucket sort
        vetor = copiarVetor(vetorOriginal);
        BucketSort.Estatisticas statsBucket = BucketSort.ordenar(vetor, tamanho);
        System.out.println("Bucket Sort - Comp: " + statsBucket.comparacoes + ", Mov: " + statsBucket.movimentacoes);
    }
    
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        
        int tamanho1 = 20;
        int tamanho2 = 20;
        int tamanho3 = 20;
        
        System.out.println("=== VETOR 1 (Desordenado) ===");
        testarAlgoritmos(vetor1, tamanho1);
        
        System.out.println("\n=== VETOR 2 (Quase Ordenado) ===");
        testarAlgoritmos(vetor2, tamanho2);
        
        System.out.println("\n=== VETOR 3 (Ordem Decrescente) ===");
        testarAlgoritmos(vetor3, tamanho3);
    }
}
