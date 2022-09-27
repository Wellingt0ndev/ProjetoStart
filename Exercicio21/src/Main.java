import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde)
        // e informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais;
        int apto = 0;
        int naoApto = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quantas pessoas vai entrevistar? ");
        int n = leitor.nextInt();
        System.out.println("=======CADASTRO DE CANDIDATOS===========");
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o nome: ");
            String nome = leitor.next();
            System.out.print("Digite o sexo:[F/M] ");
            char sexo = leitor.next().charAt(0);
            System.out.print("Digite a idade: ");
            int idade = leitor.nextInt();
            System.out.println("Estado de saúde");
            System.out.println("1 - Boa");
            System.out.println("2 - Regular");
            System.out.println("3 - Ruim");
            System.out.print("Digite o número correspondente: ");
            int saude = leitor.nextInt();
            if (idade >= 18 && saude == 1) {
                System.out.printf("%s, tem %d anos  está com a saúde boa, portanto está " +
                        "apto(a) a cumprir o serviço militar\n", nome, idade);
                apto++;
            } else if (idade < 18) {
                System.out.printf("%s, tem %d anos, portanto não tem idade suficiente" +
                        "\n", nome, idade);
                naoApto++;
            } else {
                System.out.printf("%s, tem %d anos não está com a saúde boa, portanto não está " +
                        "apto(a) a cumprir o serviço militar\n", nome, idade);
                naoApto++;
            }

        }
        System.out.printf("%d está apto \n", apto);
        System.out.printf("%d não está apto", naoApto);
    }
}