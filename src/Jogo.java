import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private Jogador melhorJogador;
    private int numeroJogadas;

    public Jogo(Jogador melhorJogador) {
        this.melhorJogador = melhorJogador;
        this.numeroJogadas = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");
        System.out.println("Digite sua jogada (Pedra, Papel ou Tesoura):");
        String jogadaJogador = scanner.nextLine().toLowerCase();

        // Verifica se a jogada do jogador é válida
        if (!jogadaJogador.equals("pedra") && !jogadaJogador.equals("papel") && !jogadaJogador.equals("tesoura")) {
            System.out.println("Jogada inválida. Por favor, digite Pedra, Papel ou Tesoura.");
            return;
        }

        // Gera uma jogada aleatória para o computador
        String[] jogadasPossiveis = {"pedra", "papel", "tesoura"};
        String jogadaComputador = jogadasPossiveis[random.nextInt(3)];

        // Imprime as jogadas
        System.out.println("Você escolheu: " + jogadaJogador);
        System.out.println("O computador escolheu: " + jogadaComputador);

        // Verifica o resultado do jogo
        if (jogadaJogador.equals(jogadaComputador)) {
            System.out.println("Empate!");
        } else if ((jogadaJogador.equals("pedra") && jogadaComputador.equals("tesoura")) ||
                (jogadaJogador.equals("papel") && jogadaComputador.equals("pedra")) ||
                (jogadaJogador.equals("tesoura") && jogadaComputador.equals("papel"))) {
            System.out.println("Você ganhou!");
            melhorJogador.adicionaPontos(1);
        } else {
            System.out.println("Você perdeu!");
        }

        // Atualiza o número de jogadas e tentativas do jogador
        numeroJogadas++;
        melhorJogador.adicionaTentativa();
    }

    public Jogador getMelhorJogador() {
        return melhorJogador;
    }

    public int getNumeroJogadas() {
        return numeroJogadas;
    }
}