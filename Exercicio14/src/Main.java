import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = leitor.nextInt();
        if (n1 > n2)
            System.out.print("O primeiro número é maior ");
        else if (n1 == n2)
            System.out.println("Os dois são iguais");
        else
            System.out.println("O segundo número é maior");
    }
}