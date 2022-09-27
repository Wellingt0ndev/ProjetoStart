import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
        // Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
        // Informe o valor de custo de cada produto, o valor de venda de cada produto,
        // a média de preço de custo e do preço de venda;
        float mediaCusto = 0;
        float mediaVenda = 0;
        float custoTotal = 0;
        float vendaTotal = 0;
        int i;
        Scanner leitor = new Scanner(System.in);
        for ( i = 0; i < 40; i++) {
            System.out.print("Informe o preço de custo do produto: ");
            float custo = leitor.nextFloat();
            System.out.print("Informe o preço de venda do produto: ");
            float venda = leitor.nextFloat();
            if (custo < venda)
                System.out.println("Essa venda deu lucro");
            else if (custo == venda)
                System.out.println("Essa venda deu empate, não deu lucro e nem prejuízo");
            else
                System.out.println("Essa venda deu prejuízo");
            System.out.println("Preço de custo: "+ custo);
            System.out.println("Preço de venda: "+ venda);
            custoTotal += custo;
            vendaTotal += venda;
        }
        mediaCusto = custoTotal/i;
        mediaVenda = vendaTotal / i;
        System.out.println("Média de custo: " + mediaCusto);
        System.out.println("Média de venda: "+ mediaVenda);
    }
}