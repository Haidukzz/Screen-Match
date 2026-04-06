import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoLancamento(1979);
        meuFilme.setDuracaoMinutos(170);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações : " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


    }
}
