package org.example;

public class VeiculoVisitor implements Visitor {
    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(Carro carro) {
        return "Carro{" +
                "ano=" + carro.getAno() +
                ", cor='" + carro.getCor() + '\'' +
                ", numero de rodas=" + carro.getNumRodas() +
                '}';
    }

    @Override
    public String exibirOnibus(Onibus onibus) {
        return "Onibus{" +
                "ano=" + onibus.getAno() +
                ", numero de rodas=" + onibus.getNumRodas() +
                ", cor='" + onibus.getCor() + '\'' +
                ", numero de assentos=" + onibus.getNumAssentos() +
                '}';
    }

    @Override
    public String exibirCaminhao(Caminhao caminhao) {
        return "Caminhao{" +
                "ano=" + caminhao.getAno() +
                ", numero de rodas=" + caminhao.getNumRodas() +
                ", cor='" + caminhao.getCor() + '\'' +
                ", numero de eixos=" + caminhao.getNumEixos() +
                '}';
    }
}
