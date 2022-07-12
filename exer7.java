import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Atributos
            int horas;
            float valor;

            // Input
            System.out.print("Total de horas trabalhadas: ");
            horas = input.nextInt();

            
            valor = (float) (horas * 10.25);

           
            System.out.println("Valor a ser ao funcionário:" + valor);

            if (valor < 50)
                System.out.println("Atenção, dirija-se à direção do Hotel!");
        }
    }
}