package org.example;

public class Onibus implements Veiculo {
    private int ano;
    private int numRodas;
    private String cor;
    private int numAssentos;

    public Onibus(int ano, int numRodas, String cor, int numAssentos) {
        this.ano = ano;
        this.numRodas = numRodas;
        this.cor = cor;
        this.numAssentos = numAssentos;
    }

    public int getAno() {
        return ano;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public String getCor() {
        return cor;
    }

    public int getNumAssentos() {
        return numAssentos;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirOnibus(this);
    }
}
