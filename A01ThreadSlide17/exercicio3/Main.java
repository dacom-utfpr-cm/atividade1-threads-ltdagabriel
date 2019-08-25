package exercicio3;

/**
 * Faça um programa Java que envia interrupções para as extras.threads dos
 * exercícios anteriores. As extras.threads devem fazer o tratamento dessas
 * interrupções e realizar uma finalização limpa.
 *
 * @autor: Gabriel Choptian
 */
public class Main {
    public static void main(String[] args) {
        Thread a =new ThreadFile();
        Thread b =new ThreadWait();
        a.start();
        a.interrupt();

        b.start();
        b.interrupt();
    }
}
