import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual a quantidade de tentativas: ");
        int qtd = leitor.nextInt();
        for (int i = 1; i<= qtd; i++){
            System.out.println("Digite um número: ");
            int num = leitor.nextInt();
            if (num < 0 )
                System.out.println("negativo");
            else if (num == 0)
                System.out.println("Zero");
            else
                System.out.println("positivo");

            }
        }

    }
