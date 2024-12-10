package TV;

import java.util.Scanner;

public class EstudoTV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV tv1 = new TV(110);
        TV tv2 = new TV(220);

        System.out.print("\nInforme o tamanho da sua TV.TV: ");
        int tamanho = scanner.nextInt();

        System.out.println("\n--- Operações com a TV.TV 1 ---");
        tv1.ligar();
        tv1.consumoEnergia(tamanho);
        tv1.aumentarVolume();
        tv1.diminuirVolume();
        tv1.subirCanal();
        tv1.descerCanal();
        tv1.desligar();

        System.out.println("\n--- Operações com a TV.TV 2 ---");
        tv2.ligar();
        tv2.consumoEnergia(tamanho);
        tv2.aumentarVolume();
        tv2.diminuirVolume();
        tv2.subirCanal();
        tv2.descerCanal();
        tv2.desligar();

        scanner.close();
    }
}