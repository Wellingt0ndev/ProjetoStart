import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome
        // e se ela é homem ou mulher. No final informe total de homens e de mulheres;

        char sexo;
        int homens = 0;
        int mulheres = 0;
        int sexoindefinido = 0;
        for (int i = 1; i <= 5; i++) {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite seu nome: ");
            String nome = leitor.nextLine();
            System.out.print("Qual seu sexo:[F/M] ");
            sexo = leitor.next().charAt(0);
            if (sexo == 'F' || sexo == 'f') {
                System.out.printf("%s é uma mulher\n", nome);
                mulheres++;
            } else if (sexo == 'm' || sexo == 'M') {
                System.out.printf("%s é um homem\n", nome);
                homens++;
            } else {
                System.out.printf("%s tem o sexo indefinido\n", nome);
                sexoindefinido++;
            }
        }
        System.out.printf("O total de homens foi %d, de mulheres foi %d , e os indefinidos foi %d",
                homens, mulheres, sexoindefinido);
    }
}