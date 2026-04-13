package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.Excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private boolean incluidoNoPlano;
    private int anoLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private String genero;
    private int duracaoMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não foi convertido o ano");
        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

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

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo "  + "nome= " + nome  + ", anoLancamento= " + anoLancamento + "duracao: " + duracaoMinutos;
    }
}

