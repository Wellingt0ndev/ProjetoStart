import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2= leitor.nextInt();
        int soma = n1 + n2;
        System.out.printf("A soma de %d e %d é %d",n1,n2, soma );

    }
}
