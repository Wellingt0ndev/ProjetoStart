import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
        // Faça um algoritmo que calcule e exiba o salário de um professor.
        // Sabe-se que o valor da hora/aula segue a tabela abaixo:
        //a. Professor Nível 1 R$12,00 por hora/aula;
        //b. Professor Nível 2 R$17,00 por hora/aula;
        //c. Professor Nível 3 R$25,00 por hora/aula.
        float valorHora = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a hora/aula trabalhada: ");
        float hora = leitor.nextFloat();
        System.out.println("Digite o nível do professor[1, 2, 3]");
        int nivel = leitor.nextInt();
        switch (nivel) {
            case 1:
                valorHora = 12.00f;
                result(hora, valorHora);
                break;
            case 2:
                valorHora = 17.00f;
                result(hora, valorHora);
                break;
            case 3:
                valorHora = 25.00f;
                result(hora, valorHora);
                break;
        }
    }

    private static void result(float hora, float valorHora) {
        float salario;
        salario = hora * valorHora;
        System.out.printf("O salário do professor será de R$%.2f", salario);
    }
}
