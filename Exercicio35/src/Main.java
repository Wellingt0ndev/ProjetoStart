
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo
        // da conta de luz segue a tabela abaixo:
        //Tipo de Cliente Valor do KW/h
        //a. (Residência) 0,60;
        //b. (Comércio) 0,48;
        //c. (Indústria) 1,29.
        float valor;
        float valorConta;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a quantidade KW/h: ");
        float consumo = leitor.nextFloat();
        System.out.println("Tipo de Cliente:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        System.out.print("Digite o número correspondente: ");
        int tipo = leitor.nextInt();
        switch (tipo){
            case 1:
                valor = 0.60f;
                break;
            case 2:
                valor = 0.48f;
                break;
            case 3:
                valor = 1.29f;
                break;
            default:
                System.out.println("Tipo inválido");
                return;
        }
        valorConta = consumo * valor;
        System.out.printf("O valor da conta é %.2f reais", valorConta);
    }
}