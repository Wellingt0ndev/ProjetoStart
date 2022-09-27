import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros.
        // Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        float valor = leitor.nextFloat();
        float parcelas = valor / 5;
        System.out.printf("A compra de %.2f reais fica 5 prestações de %.2f reais", valor, parcelas);
    }
}