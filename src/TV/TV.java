package TV;

public class TV {
    private int voltagem;
    private int volume;
    private int canal;
    private boolean ligada;

    public TV(int voltagem) {
        if (voltagem == 110 || voltagem == 220) {
            this.voltagem = voltagem;
        } else {
            System.out.println("Voltagem inválida! Definindo como 220V por padrão.");
            this.voltagem = 220;
        }
        this.volume = 5; // Volume inicial
        this.canal = 1; // Canal inicial
        this.ligada = false; // TV.TV inicia desligada
    }

    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A televisão foi ligada.");
        } else {
            System.out.println("A televisão já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("A televisão foi desligada.");
        } else {
            System.out.println("A televisão já está desligada.");
        }
    }

    public void consumoEnergia(int tamanhoTela) {
        if (tamanhoTela <= 0) {
            System.out.println("Tamanho de tela inválido!");
            return;
        }
        double consumo = tamanhoTela * (voltagem == 110 ? 0.5 : 0.7);
        System.out.println("Consumo estimado de energia: " + consumo + " kWh.");
    }
    public void aumentarVolume() {
        if (ligada) {
            if (volume < 10) {
                volume++;
                System.out.println("Volume aumentado para: " + volume);
            } else {
                System.out.println("O volume já está no máximo!");
            }
        } else {
            System.out.println("A TV.TV está desligada! Ligue-a para ajustar o volume.");
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            if (volume > 1) {
                volume--;
                System.out.println("Volume reduzido para: " + volume);
            } else {
                System.out.println("O volume já está no mínimo!");
            }
        } else {
            System.out.println("A TV.TV está desligada! Ligue-a para ajustar o volume.");
        }
    }

    public void subirCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("A TV.TV está desligada! Ligue-a para mudar de canal.");
        }
    }

    public void descerCanal() {
        if (ligada) {
            if (canal > 1) {
                canal--;
                System.out.println("Canal alterado para: " + canal);
            } else {
                System.out.println("O canal já está no menor valor!");
            }
        } else {
            System.out.println("A TV.TV está desligada! Ligue-a para mudar de canal.");
        }
    }
}
