import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10
        // (inclusive) e 150 (inclusive);
        Scanner leitor = new Scanner(System.in);
        //Inicia o contador fora do laço for
        int cont = 0;
        for (int i = 1; i <= 80; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = leitor.nextInt();
            if (num >= 10 && num <= 150) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}