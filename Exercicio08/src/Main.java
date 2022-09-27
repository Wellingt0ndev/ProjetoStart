import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um
        // valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e
        // também a quantidade de dólares disponíveis com o usuário;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor em dólar: ");
        float dolar = leitor.nextFloat();
        System.out.print("Digite o valor da cotação do dólar: ");
        float cotacao = leitor.nextFloat();
        float real = dolar * cotacao;
        System.out.printf("%.2f dólares convertidos com a cotação de hoje é %.2f reais", dolar,real);
    }
}