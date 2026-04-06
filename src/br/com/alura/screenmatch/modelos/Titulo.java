package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private boolean incluidoNoPlano;
    private int anoLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private String genero;
    private int duracaoMinutos;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public boolean IncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}

