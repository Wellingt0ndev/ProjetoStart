
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
        int[] valores = new int[3];
        int aux;
        Scanner leitor = new Scanner(System.in);
        //Carregando os números no vetor
        for (int i = 0; i <= 2; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            valores[i] = leitor.nextInt();
        }
        //Ordenando de forma crescente
        //Laço com a quantidade de elementos do vetor - 1
        for (int j = 1; j <= 2; j++) {
            //Laço percorre da última posição à posição j do vetor
            for (int i = 2; i >= j; i--) {
                if (valores[i] < valores[i - 1]) {
                    aux = valores[i];
                    valores[i] = valores[i - 1];
                    valores[i - 1] = aux;
                }
            }
        }
        //Mostrando o vetor ordenado
        for (int i = 0; i <= 2; i++) {
            System.out.printf(valores[i] + " ");
        }
    }
}


//SEGUNDA OPÇÃO!
        /*Scanner leitor = new Scanner(System.in);
        int valor1, valor2, valor3;
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

}*/