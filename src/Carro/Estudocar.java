package Carro;

import java.util.Scanner;
import Carro.Carro;

public class Estudocar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("\nCaracteristicas do Carro.:");

        carro.ligarCarro();
        carro.acelerar();
        carro.desacelerar();

        carro.virar("direita");
        carro.virar("esquerda");
        carro.virar("outro");

        carro.mudarMarcha("cima");
        carro.mudarMarcha("baixo");
        carro.mudarMarcha("neutro");

    }
}
