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
        // Foram copiados as classes ThreadFile e ThreadWait, e alterado exceção
        Thread a =new ThreadFile();
        Thread b =new ThreadWait();
        // Inicializa a Thread
        a.start();
        b.start();
        // Gera interrupção
        a.interrupt();
        b.interrupt();

    }
}
