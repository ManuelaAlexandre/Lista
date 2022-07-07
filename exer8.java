import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
           
            int horas;
            float valor;

            
            System.out.print("Quantidade de horas trabalhadas: ");
            horas = input.nextInt();

            
            valor = (float) (horas * 10.25);

            
            System.out.println("Valor que deve ser pago ao funcionario: " + valor);

            if (valor < 50)
                System.out.println("Atenção, dirija-se à direção do Hotel!");
        }
    }
