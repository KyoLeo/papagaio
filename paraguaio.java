public class Main {
    
}
import java.util.Scanner;

public class CalculoTempoCrescimentoPapagaio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade inicial do papagaio (em anos):");
        int idadeInicial = scanner.nextInt();

        System.out.println("Digite a taxa de crescimento anual do papagaio (em anos):");
        double taxaCrescimentoAnual = scanner.nextDouble();

        System.out.println("Digite a expectativa de vida do papagaio (em anos):");
        int expectativaVida = scanner.nextInt();

        // Calcula o tempo de crescimento do papagaio
        double tempoCrescimento = calcularTempoCrescimento(idadeInicial, taxaCrescimentoAnual, expectativaVida);

        System.out.println("O papagaio levará " + tempoCrescimento + " anos para atingir a sua expectativa de vida.");
    }

    public static double calcularTempoCrescimento(int idadeInicial, double taxaCrescimentoAnual, int expectativaVida) {
        double idade = idadeInicial;
        int anos = 0;

        while (idade < expectativaVida) {
            idade += taxaCrescimentoAnual;
            anos++;
        }

        return anos;
    }
}
