package Carro;

public class Carro {
    private String modelo;
    private int marcha;
    private double aceleracao;
    private double velocidade;

    public Carro() {
        modelo = "Civic";
        marcha = 1;
        aceleracao = 0.0;
        velocidade = 0.0;
    }

    public void detalhesCarro() {
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("A marcha está na: " + marcha);
        System.out.println("A aceleração do carro é: " + aceleracao);
        System.out.println("A velocidade do carro é: " + velocidade);
    }

    public void ligarCarro() {
        System.out.println("Ligado.");
    }

    public void desligarCarro() {
        System.out.println("Desligado.");
    }

    public void acelerar() {
        System.out.println("Aelerando.");
    }

    public void desacelerar() {
        System.out.println("Desacelerando.");
    }

    public void virar(String direcao) {
        switch (direcao.toLowerCase()) {
            case "direita":
                System.out.println("Indo a direita.");
                break;
            case "esquerda":
                System.out.println("Indo a esquerda.");
                break;
            default:
                System.out.println("Indo em linha reta.");
        }
    }

    public void mudarMarcha(String direcao) {
        switch (direcao.toLowerCase()) {
            case "cima":
                System.out.println("A marcha está aumentada.");
                break;
            case "baixo":
                System.out.println("A marcha está reduzida.");
                break;
            default:
                System.out.println("A marcha está em neutro.");
        }
    }
}
