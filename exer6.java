import java.util.Scanner; 

 public class exer6 { public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) { 
       
       int num; 
       boolean primo;
       String tipo;
  
  System.out.print("Digite um número: ");
   num = input.nextInt();
   
   if (num % 2 == 0) {
       tipo = "par";
   }
   
   else {
     tipo = "impar";
   }

   primo = true;
     for(int i = 2; i < num; i++) {            
     if(num % i == 0) {
     primo = false;
                }
            }

   if (primo) {
 System.out.println("O número " + num + " é " + tipo + " e é primo.");
            }
            else {
                System.out.println("O número " + num + " é " + tipo + " e não é primo.");
            }
        }

