import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número e mostre uma mensagem caso este número
        // seja maior que 80, menor que 25 ou igual a 40;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = leitor.nextInt();
       if (num > 80)
            System.out.println("O número informado é maior que 80");
        else if (num < 25)
            System.out.println("O número informado é menor que 25");
        else if (num == 40)
            System.out.println("O número informado é igual a 40");
        //Segunda opção
         /*if(num > 80 || num < 25 || num == 40)
            System.out.println("Exiba a mensagem");*/

    }

}
