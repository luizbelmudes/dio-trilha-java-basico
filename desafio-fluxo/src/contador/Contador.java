package contador;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        int primeiroParametro;
        int segundoParametro;
        System.out.println("Digite o primeiro Parametro");
        /* Try-Catch abaixo pega a Exception se
        * o tipo de parametro nao for inteiro */
        try {
            primeiroParametro = terminal.nextInt();
            System.out.println("Digite o segundo Parametro");
            segundoParametro = terminal.nextInt();
        } catch (java.util.InputMismatchException ex){
            System.out.println("Parâmetro inválido! Digite um número inteiro");
            return;
        }
        /* Try-Catch abaixo pega a Exception se
         * o a combinação de parametros não for válida */
        try {
             contar(primeiroParametro, segundoParametro);
         } catch (ParametrosInvalidosException ex) {
             System.out.println("Parâmetros inválidos!");
        }

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        int contagem = segundoParametro - primeiroParametro;
        if (contagem <= 0) {
            throw new ParametrosInvalidosException();
        }
        for(int index = 1;index <= contagem;index++){
            System.out.println("Imprimindo o numero " + index);
        }
    }
}

class ParametrosInvalidosException extends RuntimeException {

}