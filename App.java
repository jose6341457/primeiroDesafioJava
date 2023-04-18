import java.util.Scanner;
/*Desafio
Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de
valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.
Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor
e x é o valor armazenado naquela posição.
* */
public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();
        int x = 0;
        int N [] = new int[10];

        for (int i = 0; i < N.length; i++){

            if(x == t){x = 0;}

            System.out.println("N[" + i + "]" + x);
            x++;
            }
        }

    }
