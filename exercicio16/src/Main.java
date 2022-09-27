import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
        // Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),
        // Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
        Scanner leitor = new Scanner(System.in);
        System.out.print("Escreva o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.print("Digite a primeira nota: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = leitor.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = leitor.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("O aluno %s com a média %.2f está ", nome , media);
        if (media >= 7)
            System.out.print("aprovado");
        else if (media <= 5 )
            System.out.print("reprovado");
        else
            System.out.print("recuperação");
    }
}