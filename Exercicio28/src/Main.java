import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários
        // de acordo com os seguintes critérios:
        //a. 50% para aqueles que ganham menos do que três salários mínimos;
        //b. 20% para aqueles que ganham entre três até dez salários mínimos;
        //c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        //d. 10% para os demais funcionários.
        //Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo
        // salário reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário.
        // Calcule quanto à empresa vai aumentar sua folha de pagamento;
        float reajuste;
        float salarioNovo;
        float totReajuste;
        float salarioMinimo;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do salário mínimo: ");
        salarioMinimo = leitor.nextFloat();
        for (int i = 0; i < 584; i++) {
            System.out.println("Digite o nome do funcionário: ");
            String nome = leitor.next();
            System.out.println("Digite o salário desse funcionário: ");
            float salarioAtual = leitor.nextFloat();
            if (salarioAtual < (salarioMinimo * 3))
                reajuste = 0.5f;
            else if (salarioAtual <= (salarioMinimo * 10))
                reajuste = 0.2f;
            else if (salarioAtual <= (salarioMinimo * 20))
                reajuste = 0.15f;
            else
                reajuste = 0.1f;
            totReajuste = salarioAtual * reajuste;
            salarioNovo = salarioAtual + totReajuste;
            System.out.printf("O funcionário %s recebeu um reajuste de %.2f e o seu novo salário é %.2f\n",
                    nome, totReajuste, salarioNovo);

        }

    }


}

