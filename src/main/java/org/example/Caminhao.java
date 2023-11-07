package org.example;

public class Caminhao implements Veiculo {
    private int ano;
    private int numRodas;
    private String cor;
    private int numEixos;

    public Caminhao(int ano, int numRodas, String cor, int numEixos) {
        this.ano = ano;
        this.numRodas = numRodas;
        this.cor = cor;
        this.numEixos = numEixos;
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

    public int getNumEixos() {
        return numEixos;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCaminhao(this);
    }
}
