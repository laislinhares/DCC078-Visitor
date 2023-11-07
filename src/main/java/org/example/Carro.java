package org.example;

public class Carro implements Veiculo {
    private int ano;
    private int numRodas;
    private String cor;

    public Carro(int ano, int numRodas, String cor) {
        this.ano = ano;
        this.numRodas = numRodas;
        this.cor = cor;
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

    public String aceitar(Visitor visitor) {
        return visitor.exibirCarro(this);
    }
}
