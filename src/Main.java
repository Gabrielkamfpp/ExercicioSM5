 public static void main(String[] args) {

     Jogador jogador = new Jogador("Alice", 25, 0, 0);

     Jogo jogo = new Jogo(jogador);

     for (int i = 0; i < 3; i++) {
         System.out.println("\nJogada #" + (i + 1));
         jogo.jogar();

         System.out.println("\nPontuação final de " + jogador.getNome() + ": " + jogador.getPontuacao());
         System.out.println("Número total de jogadas: " + jogo.getNumeroJogadas());
     }
 }

