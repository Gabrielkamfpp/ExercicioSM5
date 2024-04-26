import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaMelhoresJogadores {
    private List<Jogador> melhoresJogadores;


    public ListaMelhoresJogadores() {
        this.melhoresJogadores = new ArrayList<>();
    }


    public void adicionarJogador(Jogador jogador) {
        Scanner scanner = new Scanner(System.in);

        // Verifica se o nome do jogador já existe na lista
        while (existeJogadorComNome(jogador.getNome())) {
            System.out.println("Nome de jogador já existente. Por favor, insira outro nome:");
            String novoNome = scanner.nextLine();
            jogador.setNome(novoNome);
        }

        melhoresJogadores.add(jogador);
        atualizarRanking();
    }

    private boolean existeJogadorComNome(String nome) {
        return false;
    }


    private void atualizarRanking() {
        melhoresJogadores.sort((jogador1, jogador2) -> jogador2.getPontuacao() - jogador1.getPontuacao());
        for (int i = 0; i < melhoresJogadores.size(); i++) {
            melhoresJogadores.get(i).setPosicaoRanking(i + 1);
        }
    }

    public List<Jogador> getMelhoresJogadores() {
        return melhoresJogadores;
    }
}

