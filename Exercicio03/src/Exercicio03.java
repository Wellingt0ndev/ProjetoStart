import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida
        // a distância total percorrida pelo automóvel e o total de combustível gasto;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a distância percorrida(km): ");
        float distancia = leitor.nextFloat();
        System.out.print("Digite o total de litros de combustível gasto: ");
        float totCombustivel = leitor.nextFloat();
        float consumoMedio = distancia / totCombustivel;
        System.out.println("A média de consumo do automóvel é: "+ consumoMedio + "km/l");
    }
}
