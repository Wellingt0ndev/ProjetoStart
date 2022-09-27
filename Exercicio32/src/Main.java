import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os
        // lados de um triângulo. Se forem, informar qual o tipo de triângulo que eles formam:
        // equilátero, isóscele ou escaleno.
        // Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos
        // comprimentos dos outros dois lados.
        //a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
        //b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
        //c. Triângulo equilátero é também isóscele;
        //d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        int lado1 = leitor.nextInt();
        System.out.print("Digite o segundo lado: ");
        int lado2 = leitor.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int lado3 = leitor.nextInt();
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            System.out.print("É um triângulo: ");
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Escaleno");
            } else {
                System.out.println("Isóscele");
            }
        }
    }
}