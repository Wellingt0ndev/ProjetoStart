
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
        int valor1, valor2, valor3;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        valor1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        valor2 = leitor.nextInt();
        System.out.println("Digite o terceiro número: ");
        valor3 = leitor.nextInt();
        System.out.println(ordenar(valor1, valor2, valor3));


    }

    public static String ordenar(int n1, int n2, int n3) {
        int aux = 0;

        if (n1 > n2) {
            aux = n2;
            n2 = n1;
            n1 = aux;
        }

        if (n2 > n3) {
            aux = n3;
            n3 = n2;
            n2 = aux;
        }

        if (n1 > n2) {
            aux = n2;
            n2 = n1;
            n1 = aux;
        }

        return n1 + " " + n2 + " " + n3;
    }

}