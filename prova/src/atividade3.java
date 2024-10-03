import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {

        int quantidadeAlimento = 0;
        double soma = 0;
        int avaliacaoAlimento = 0;
        double media = 0;
        String classificacao = "";

        System.out.println("Qual a quantidade de alimentos?");
        Scanner sc = new Scanner(System.in);
        quantidadeAlimento = sc.nextInt();


        for (int i =0; i < quantidadeAlimento ; i++){
            System.out.println("Qual sua avaliação de 0-10: " );
            avaliacaoAlimento = sc.nextInt();

            if (avaliacaoAlimento > 10) {
                System.out.println("Nota inválida");
                break;
            }

            soma += avaliacaoAlimento;
        }

        media = soma / quantidadeAlimento;
        System.out.println("A media é:" + media);
        System.out.println();

        if (media >= 6){
            classificacao = "bom";

        } else {
            classificacao = "ruim";

        }
        System.out.println("Sua classificação foi: " + classificacao);

    }
}

