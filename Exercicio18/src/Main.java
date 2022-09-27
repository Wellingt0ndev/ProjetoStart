import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando
        // “maior de idade” e “menor de idade” para cada pessoa.
        // Considere a idade a partir de 18 anos como maior de idade;
        Scanner leitor = new Scanner(System.in);
        for (int i = 1; i <= 75; i++) {
            System.out.printf("Digite a %dº idade: ", i);
            int idade = leitor.nextInt();
            if (idade >= 0 && idade < 18) {
                System.out.println("Menor de idade");
            } else if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Idade inválida");
            }
        }
    }
}

