import java.util.Scanner;
    
public class exer2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       
        Double B,b,h,A;
       
        System.out.println("Digite a base maior: ");
        B = input.nextDouble();
       
        System.out.println("Digite a base menor: ");
        b = input.nextDouble();
       
        System.out.println("Digite a  altura");
        h = input.nextDouble();
       
        A = h*((B + b)/2);
       
        System.out.println("A área do trapezio é: " +A);
    
        System.out.println("A área arredondada do trapezio é: " + Math.round(A) );
    }
    }

