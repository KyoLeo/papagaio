public class Main {
    
}
import java.util.Scanner;

public class IdentificarPapagaio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a cor das penas do papagaio:");
        String corDasPenas = scanner.nextLine().toLowerCase();
        
        String especie = identificarEspecie(corDasPenas);
        
        if (especie != null) {
            System.out.println("A espécie do papagaio é: " + especie);
        } else {
            System.out.println("Não foi possível identificar a espécie do papagaio.");
        }
    }
    
    public static String identificarEspecie(String corDasPenas) {
        switch(corDasPenas) {
            case "vermelho":
                return "Papagaio-vermelho";
            case "azul":
                return "Papagaio-azul";
            case "verde":
                return "Papagaio-verde";
            default:
                return null;
        }
    }
}
