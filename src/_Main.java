public class _Main {
    
    static class Estatisticas {
        int comparacoes;
        int movimentacoes;
        int iteracoes;
        long tempoNano;
        
        Estatisticas(int comp, int mov, int iter, long tempo) {
            this.comparacoes = comp;
            this.movimentacoes = mov;
            this.iteracoes = iter;
            this.tempoNano = tempo;
        }
    }
    
    static class ResultadoAlgoritmo {
        String nome;
        int trocas;
        int iteracoes;
        long tempo;
        
        ResultadoAlgoritmo(String nome, int trocas, int iter, long tempo) {
            this.nome = nome;
            this.trocas = trocas;
            this.iteracoes = iter;
            this.tempo = tempo;
        }
    }
    
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
    
    static void testarAlgoritmos(int[] vetorOriginal, int tamanho, String nomeVetor) {
        int[] vetor;
        ResultadoAlgoritmo[] resultados = new ResultadoAlgoritmo[6];
        
        System.out.println("=== " + nomeVetor + " ===\n");
        
        // Bubble Sort
        vetor = copiarVetor(vetorOriginal);
        long inicio = System.nanoTime();
        BubbleSort.Estatisticas statsBubble = BubbleSort.ordenar(tamanho, vetor);
        long fim = System.nanoTime();
        long tempoBubble = fim - inicio;
        System.out.println("Bubble Sort:");
        System.out.println("-> Comparações: " + statsBubble.comparacoes);
        System.out.println("-> Trocas: " + statsBubble.movimentacoes);
        System.out.println("-> Iterações: " + statsBubble.iteracoes);
        System.out.println("-> Tempo: " + tempoBubble + " ns\n");
        resultados[0] = new ResultadoAlgoritmo("Bubble Sort", statsBubble.movimentacoes, statsBubble.iteracoes, tempoBubble);
        
        // Selection Sort
        vetor = copiarVetor(vetorOriginal);
        inicio = System.nanoTime();
        SelectionSort.Estatisticas statsSelection = SelectionSort.ordenar(tamanho, vetor);
        fim = System.nanoTime();
        long tempoSelection = fim - inicio;
        System.out.println("Selection Sort:");
        System.out.println("-> Comparações: " + statsSelection.comparacoes);
        System.out.println("-> Trocas: " + statsSelection.movimentacoes);
        System.out.println("-> Iterações: " + statsSelection.iteracoes);
        System.out.println("-> Tempo: " + tempoSelection + " ns\n");
        resultados[1] = new ResultadoAlgoritmo("Selection Sort", statsSelection.movimentacoes, statsSelection.iteracoes, tempoSelection);
        
        // Cocktail Sort
        vetor = copiarVetor(vetorOriginal);
        inicio = System.nanoTime();
        CocktailSort.Estatisticas statsCocktail = CocktailSort.ordenar(tamanho, vetor);
        fim = System.nanoTime();
        long tempoCocktail = fim - inicio;
        System.out.println("Cocktail Sort:");
        System.out.println("-> Comparações: " + statsCocktail.comparacoes);
        System.out.println("-> Trocas: " + statsCocktail.movimentacoes);
        System.out.println("-> Iterações: " + statsCocktail.iteracoes);
        System.out.println("-> Tempo: " + tempoCocktail + " ns\n");
        resultados[2] = new ResultadoAlgoritmo("Cocktail Sort", statsCocktail.movimentacoes, statsCocktail.iteracoes, tempoCocktail);
        
        // Gnome Sort
        vetor = copiarVetor(vetorOriginal);
        inicio = System.nanoTime();
        GnomeSort.Estatisticas statsGnome = GnomeSort.ordenar(tamanho, vetor);
        fim = System.nanoTime();
        long tempoGnome = fim - inicio;
        System.out.println("Gnome Sort:");
        System.out.println("-> Comparações: " + statsGnome.comparacoes);
        System.out.println("-> Trocas: " + statsGnome.movimentacoes);
        System.out.println("-> Iterações: " + statsGnome.iteracoes);
        System.out.println("-> Tempo: " + tempoGnome + " ns\n");
        resultados[3] = new ResultadoAlgoritmo("Gnome Sort", statsGnome.movimentacoes, statsGnome.iteracoes, tempoGnome);
        
        // Comb Sort
        vetor = copiarVetor(vetorOriginal);
        inicio = System.nanoTime();
        CombSort.Estatisticas statsComb = CombSort.ordenar(tamanho, vetor);
        fim = System.nanoTime();
        long tempoComb = fim - inicio;
        System.out.println("Comb Sort:");
        System.out.println("-> Comparações: " + statsComb.comparacoes);
        System.out.println("-> Trocas: " + statsComb.movimentacoes);
        System.out.println("-> Iterações: " + statsComb.iteracoes);
        System.out.println("-> Tempo: " + tempoComb + " ns\n");
        resultados[4] = new ResultadoAlgoritmo("Comb Sort", statsComb.movimentacoes, statsComb.iteracoes, tempoComb);
        
        // Bucket Sort
        vetor = copiarVetor(vetorOriginal);
        inicio = System.nanoTime();
        BucketSort.Estatisticas statsBucket = BucketSort.ordenar(vetor, tamanho);
        fim = System.nanoTime();
        long tempoBucket = fim - inicio;
        System.out.println("Bucket Sort:");
        System.out.println("-> Comparações: " + statsBucket.comparacoes);
        System.out.println("-> Trocas: " + statsBucket.movimentacoes);
        System.out.println("-> Iterações: " + statsBucket.iteracoes);
        System.out.println("-> Tempo: " + tempoBucket + " ns\n");
        resultados[5] = new ResultadoAlgoritmo("Bucket Sort", statsBucket.movimentacoes, statsBucket.iteracoes, tempoBucket);
        
        // encontrar os melhores tempos e comparacoes
        imprimirMelhores(resultados);
    }
    
    static void imprimirMelhores(ResultadoAlgoritmo[] resultados) {
        ResultadoAlgoritmo menorTempo = resultados[0];
        ResultadoAlgoritmo menorTrocas = resultados[0];
        ResultadoAlgoritmo menorIteracoes = resultados[0];
        
        for (int i = 1; i < resultados.length; i++) {
            if (resultados[i].tempo < menorTempo.tempo) {
                menorTempo = resultados[i];
            }
            if (resultados[i].trocas < menorTrocas.trocas) {
                menorTrocas = resultados[i];
            }
            if (resultados[i].iteracoes < menorIteracoes.iteracoes) {
                menorIteracoes = resultados[i];
            }
        }
        
        System.out.println("========== RESUMO =========");
        System.out.println("Menor Tempo: " + menorTempo.nome + " (" + menorTempo.tempo + " ns)");
        System.out.println("Menor Trocas: " + menorTrocas.nome + " (" + menorTrocas.trocas + " trocas)");
        System.out.println("Menor Iterações: " + menorIteracoes.nome + " (" + menorIteracoes.iteracoes + " iterações)");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        
        int tamanho = 20;
        
        testarAlgoritmos(vetor1, tamanho, "VETOR 1 (Desordenado)");
        System.out.println("\n" + "=".repeat(60) + "\n");
        
        testarAlgoritmos(vetor2, tamanho, "VETOR 2 (Quase Ordenado)");
        System.out.println("\n" + "=".repeat(60) + "\n");
        
        testarAlgoritmos(vetor3, tamanho, "VETOR 3 (Ordem Decrescente)");
    }
}