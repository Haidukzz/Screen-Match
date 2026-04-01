public class Filme {
    String nome;
    boolean incluidoNoPlano;
    int anoLancamento;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    String genero;
    int duracaoMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
