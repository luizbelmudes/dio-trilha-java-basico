package contador;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro Parametro");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Digite o segundo Parametro");
        int segundoParametro = terminal.nextInt();
        try {
             contar(primeiroParametro, segundoParametro);
         } catch (ParametrosInvalidosException ex) {
             System.out.println("Parâmetros inválidos!");
        }

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        int contagem = segundoParametro - primeiroParametro;
        if (contagem < 0) {
            throw new ParametrosInvalidosException();
        }
        for(int index = 1;index <= contagem;index++){
            System.out.println("Imprimindo o numero " + index);
        }
    }
}

class ParametrosInvalidosException extends RuntimeException {

}