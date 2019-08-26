package exercicio3;

public class ThreadWait extends Thread{
    @Override
    public void run() {
        try {
            // Math.random() retorna numeros reais entre 0 e 1
            // Mutiplicando por 1s, a Thread vai ficar em estado sleep entre 0 a 1s
            sleep((long) (Math.random() * 1_000));
            System.out.printf("Finish %s%n", this.getName());
        } catch (InterruptedException e) {
            // Mensagem genérica de exceção de interrupção

            System.out.printf("Tratando interrupção --> %s%n", e.getMessage());
        }
    }
}
