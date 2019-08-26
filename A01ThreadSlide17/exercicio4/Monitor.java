package exercicio4;


import java.util.ConcurrentModificationException;
import java.util.List;

class Monitor extends Thread {
    private List<Thread> threads;

    Monitor(List<Thread> list) {
        threads = list;
    }

    public int soma(int[] values) {
        int s = 0;
        for (int i : values) {
            s += i;
        }
        return s;
    }

    @Override
    public void run() {
        try {
            //
            int[] th = new int[threads.size()];
            // Simboliza Threads ativas
            for (int i = 0; i < th.length; i++) {
                th[i] = 1;
            }
            do {
                for (int i = 0; i < threads.size(); i++) {
                    Thread j = threads.get(i);
                    if (th[i] == 1 && j.isInterrupted()) {
                        System.out.println(String.format("Thread [%s] Interrompida", j.getName()));
                        // Simula desativar Thread
                        th[i] = 0;
                    }
                }
                sleep(10);
            } while (soma(th) > 0);
        } catch (InterruptedException | ConcurrentModificationException e) {
            System.out.println("Thread Controle interrompida");
        }

        System.out.println("Todas as Threads foram finalizadas!");
    }

}
