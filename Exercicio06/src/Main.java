import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma
        // que a variável A passe a possuir o valor da variável B e a variável B passe a possuir
        // o valor da variável A.Apresentar os valores trocados;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = leitor.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = leitor.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("A: " + a + " B: "+ b);


    }
}