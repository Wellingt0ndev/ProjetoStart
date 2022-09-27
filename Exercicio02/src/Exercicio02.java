import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
        // multiplicação e a divisão dos dois números lidos;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = leitor.nextInt();
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        double divisao = (double) n1 / n2;
        System.out.println("Soma: "+ soma);
        System.out.println("Subtração: "+ subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: "+divisao);
    }
}
