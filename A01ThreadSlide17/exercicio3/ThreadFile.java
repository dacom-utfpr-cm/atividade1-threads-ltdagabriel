package exercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ThreadFile extends Thread {
    @Override
    public void run() {
        // Arquivo com as frases
        Path file = Paths.get("resources/quotes.txt");
        try {
            // Salva todas as frases em uma lista de frases, considerando que cada frase esta em uma linha
            List<String> lines = Files.readAllLines(file);

            for (String i : lines) {
                // para cada linha, escreve a frase e aguarda 10s
                System.out.println(i);
                sleep(10_000);

            }
        } catch (InterruptedException e) {
            System.out.printf("Tratando interrupção --> %s%n", e.getMessage());
        } catch (IOException e) {
            System.out.printf("Exceção de leitura de arquivo --> %s%n", e.getMessage());
        }
    }
}
