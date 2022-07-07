import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            int horas;
            float salario;

            
            System.out.print("Total de horas trabalhadas: ");
            horas = input.nextInt();

            
            salario = (float) (horas * 10.25);

           
            System.out.println("Salário a ser pago ao funcionario:" + salario);
        }
    }
}