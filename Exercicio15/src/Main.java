import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        if (num >= 100 && num <= 200)
            System.out.printf("o número %d está entre 100 e 200", num);
        else
            System.out.printf("o número %d não está entre 100 e 200", num);
    }
}