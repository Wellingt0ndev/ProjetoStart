import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número e mostre uma
        // mensagem caso este número seja maior que 10;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        if (num > 10)
            System.out.printf("o número %d é maior que 10", num);
        else
            System.out.printf("O número %d não é maior que 10", num);
    }
}