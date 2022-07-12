import java.util.Scanner;
public class exer8 {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        float x,valor;
            
   System.out.println("O quê você deseja fazer? ");
   System.out.println("1. Converter quilogramas em libras.");
   System.out.println("2. Converter libras em quilogramas.");
            menu = input.nextInt();

            
            if (menu == 1) {
                System.out.println("Digite o valor a ser convertido: ");
                x = input.nextInt();

               valor = (x* 1000);
               valor = (valor/ 454);
     system.out.println("O valor da conversão de  quilogramas para libra:" + valor);
            }
            else {
                System.out.println("Digite o valor a ser convertido: " + valor);
                valor = input.nextInt();

         valor = (x * 454);
         valor = (valor / 1000);


                 system.out.println("O valor da conversão de  libra para quilogramas:" + valor);
            }
        }
    }

