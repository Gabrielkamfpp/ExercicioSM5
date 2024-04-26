public class Jogador {

    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;

    // Construtor que recebe todos os dados do jogador
    public Jogador(String nome, int idade, int pontuacao, int numeroTentativas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentativas = numeroTentativas;
    }

    // Métodos para adicionar e remover pontos e adicionar tentativas
    public void adicionaPontos(int pontos) {
        this.pontuacao += pontos;
    }

    public void perdePontos(int pontos) {
        this.pontuacao -= pontos;
        if (this.pontuacao < 0) {
            this.pontuacao = 0; // Certifica-se de que a pontuação não seja negativa
        }
    }

    public void adicionaTentativa() {
        this.numeroTentativas++;
    }

    // Getters e Setters para todos os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }

    public void setNumeroTentativas(int numeroTentativas) {
        this.numeroTentativas = numeroTentativas;
    }

    public void setPosicaoRanking(int i) {

    }
}