import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes.
        // Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais.
        // Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        if (num1 == num2)
            System.out.println("Os números são iguais");
        else if (num1 != num2) {
            System.out.println("Os números são diferentes");
            if (num1 > num2)
                System.out.println("O primeiro número é maior");
            else
                System.out.println("O segundo número é maior");
        }
    }
}