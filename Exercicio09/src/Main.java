import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento
        // após um mês.Considere fixo o juro da poupança em 0,07% a. m;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor depositado na poupança: ");
        float valor = leitor.nextFloat();
        final float JUROS = 0.0007f;
        float rendimento = valor * JUROS;
        System.out.printf("O rendimento de %.2f reais depois de um mês na poupança será de %.2f reais", valor, rendimento);
    }
}