import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto.
        // Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.
        // O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível
        // (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada
        // de dados. Informe total de desconto e total pago pelos clientes;
        float porcentagem = 0;
        float totDesconto;
        float totVeiculo;
        float valorVeiculo = 1.0f;
        Scanner leitor = new Scanner(System.in);
        while (valorVeiculo != 0) {
            System.out.println("Digite o valor do veiculo:(Valor 0 encerra o programa)");
            valorVeiculo = leitor.nextFloat();
            if (valorVeiculo == 0) {
                System.out.println("Finalizando o programa...");
                break;
            } else {
                System.out.println("Tipo de combustível:");
                System.out.println(" 1 - álcool");
                System.out.println(" 2 - Gasolina");
                System.out.println(" 3 - Diesel");
                System.out.print("Digite o valor correspondente: ");
                int combustivel = leitor.nextInt();
                if (combustivel == 1)
                    porcentagem = 0.25f;
                else if (combustivel == 2)
                    porcentagem = 0.21f;
                else if (combustivel == 3)
                    porcentagem = 0.14f;
                else {
                    System.out.println("número inválido! Finalizando o programa...");
                    break;
                }
                totDesconto = valorVeiculo * porcentagem;
                totVeiculo = valorVeiculo - totDesconto;
                System.out.println("Total de desconto: " + totDesconto);
                System.out.println("Total pago pelo cliente: " + totVeiculo);
            }

        }
    }
}

