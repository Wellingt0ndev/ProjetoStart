import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto.
        // Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente
        // de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo.
        // Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar
        // calculando desconto até que a resposta seja: “(N) Não”.
        // Informar total de carros com ano até 2000 e total geral;
        Scanner leitor = new Scanner(System.in);
        float valorVeiculo;
        int ano;
        float valorDesconto;
        float valorFinal;
        float valorPorcentagem;
        int carrosUsados = 0;
        int totalCarros = 0;
        char resposta = 'S';
        while (resposta == 's' || resposta == 'S') {
            System.out.print("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();
            System.out.print("Digite o ano do veículo: ");
            ano = leitor.nextInt();
            if (ano <= 2000) {
                valorPorcentagem = 0.12f;
                carrosUsados++;
            } else {
               valorPorcentagem = 0.07f;
            }
            totalCarros++;
            valorDesconto = valorVeiculo * valorPorcentagem;
            valorFinal = valorVeiculo - valorDesconto;
            System.out.printf("O valor do desconto é %.2f reais e o valor que o cliente vai pagar é %.2f reais\n",
                    valorDesconto, valorFinal);
            System.out.println("Deseja continuar?[S(Sim)/N(Não)]");
            resposta = leitor.next().charAt(0);
        }
        System.out.println("O total de veículos com o ano até 2000: "+carrosUsados);
        System.out.println("O total de carros: "+totalCarros);

    }
}
