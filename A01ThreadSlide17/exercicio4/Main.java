package exercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * Faça uma Thread que monitora um conjunto de extras.threads e
 * exiba quais extras.threads receberam sinais de interrupção.
 *
 * @autor: Gabriel Choptian
 */
public class Main {
    public static void main(String[] args) {
        List<Thread> lista = new ArrayList<>();
        ThreadGroup group = new ThreadGroup("wait");

        for (int i = 0; i < 5; i++) {
            Thread a = new Thread(group, new Runnable() {
                @Override
                public void run() {
                    // Simula processo longo
                    while (true) {
                    }
                }

            });
            // Adiciona um nome a Thread
            a.setName(String.format("Thread a_%d", i));
            lista.add(a);
        }
        // Adiciona a lista de Threads criadas para a classe monitor
        Monitor controle = new Monitor(lista);
        // Inicializa a Tread de monitoramento
        controle.start();

        // Inicializa todas as Treads da lista
        for (Thread i : lista) {
            i.start();
            i.interrupt();
        }
        try {
            controle.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
