import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas
        // efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão
        // sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do vendedor: ");
        String nome = leitor.nextLine();
        System.out.print("Digite o salário fixo: ");
        float salarioFixo = leitor.nextFloat();
        System.out.print("Digite o valor total das vendas: ");
        float totVendas = leitor.nextFloat();
        final float COMISSAO = 0.15f;
        float totSalario = (totVendas * COMISSAO) + salarioFixo;
        System.out.printf("O vendedor %s, recebe um salário fixo de %.2f \ne " +
                "com a comissão sobre as vendas o salário dele vai para %.2f", nome, salarioFixo,totSalario);


    }
}