package exercicio1;

public class ThreadWait extends Thread{
    @Override
    public void run() {
        try {
            sleep((long) (Math.random() * 1_000));
            System.out.printf("Finish %s%n", this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
