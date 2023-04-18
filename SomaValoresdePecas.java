import java.io.IOException;
import java.util.Scanner;

import static java.lang.String.format;

public class SomaValoresdePecas {
// Abaixo segue um exemplo de código que você pode ou não utilizar:

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
       // Scanner leitor2 = new Scanner(System.in);
        System.out.println("Escreva o código da peça 1: ");
        int cod1 = leitor.nextInt();
        System.out.println("Escreva o número de peças: ");
        int n1 = leitor.nextInt();
        System.out.println("Escreva o valor da peça: ");
        double valor1 = leitor.nextDouble();
        System.out.println("Escreva o código da peça 2: ");
        int cod2 = leitor.nextInt();
        System.out.println("Escreva o número de peças: ");
        int n2 = leitor.nextInt();
        System.out.println("Esvreva o valor da peça: ");
        double valor2 = leitor.nextDouble();

// TODO: Implemente um Cálculo Simples.
// Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:

        double total = (n1*valor1) + (n2*valor2);
        System.out.println(format("VALOR A PAGAR: R$ %.2f", total));


    }

}

