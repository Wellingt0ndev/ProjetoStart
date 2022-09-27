import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se
        // para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético;
        // caso contrário deve ser impressa uma mensagem de operador não definido.
        // Tratar erro de divisão por zero;
        float resultado = 0;
        Scanner leitor = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            float a = leitor.nextFloat();
            System.out.print("Digite o segundo número: ");
            float b = leitor.nextFloat();
            System.out.print("Digite um caractere: ");
            char c = leitor.next().charAt(0);
            switch (c){
                case '-':
                    resultado = a - b;
                    break;
                case '+':
                    resultado = a + b;
                    break;
                case '*':
                    resultado = a * b;
                    break;
                case '/':
                    if (b == 0){
                        System.out.println("Não pode dividir por zero");
                        break;
                    } else{
                        resultado = a / b;
                        break;
                    }
                default:
                    System.out.println("Operador não definido");
            }
        System.out.println(resultado);
    }
}