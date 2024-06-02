import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar as calorias consumidas em cada dia da semana
        int[] caloriasSemana = new int[7];

        // Nomes dos dias da semana
        String[] diasSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        // Loop  for para capturar as calorias consumidas em cada dia
        for (int i = 0; i < 7; i++) {
            System.out.print("Insira as calorias consumidas " + diasSemana[i] + ": ");
            caloriasSemana[i] = scanner.nextInt();
        }

        // Variáveis para armazenar o total e a média de calorias
        int totalCalorias = 0;
        double mediaCalorias;
        int recomendacaoDiaria = 2000;

        // Calculo do total de calorias consumidas durante a semana
        for (int i = 0; i < 7; i++) {
            totalCalorias += caloriasSemana[i];
        }

        // Calculo da média diária de calorias consumidas
        mediaCalorias = totalCalorias / 7.0;

        // Exibição dos resultados
        System.out.println("\nTotal de calorias consumidas na semana: " + totalCalorias);
        System.out.println("Média diária de calorias consumidas: " + mediaCalorias);

        // Calculo e exibição dos dias em que o consumo foi superior à recomendação diária
        System.out.println("\nDias com consumo acima de " + recomendacaoDiaria + " calorias:");
        for (int i = 0; i < 7; i++) {
            if (caloriasSemana[i] > recomendacaoDiaria) {
                System.out.println(diasSemana[i] + ": " + caloriasSemana[i] + " calorias");
            }
        }

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }}