import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
        // Afórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e
        // C a temperatura em Celsius;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual a temperatura em Celsius: ");
        float c = leitor.nextFloat();
        float f = (9 * c + 160)/5;
        System.out.printf("%.2fº Celsius é igual a %.2fº Fahrenheit",c , f);

    }
}