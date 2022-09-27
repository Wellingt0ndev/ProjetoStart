import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
        // Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado
        // pelo usuário;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor de custo do produto: ");
        float custoProduto = leitor.nextFloat();
        System.out.print("Digite o percentual de acréscimo para venda(%): ");
        float percentual = leitor.nextFloat() / 100;
        System.out.println(percentual);
        float acrescimoVenda = custoProduto * percentual;
        float valorVenda = custoProduto + acrescimoVenda;
        System.out.printf("O valor de venda do produto é %.2f reais", valorVenda);
    }
}