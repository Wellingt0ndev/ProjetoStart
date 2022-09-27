import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia o nome de um aluno e as notas das três provas
        // que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética);
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.print("Digite a primeira nota: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = leitor.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = leitor.nextFloat();
        float media = (nota1 + nota2 + nota3)/3;
        System.out.printf("O aluno %s ficou com a média %.2f", nome, media);
    }
}