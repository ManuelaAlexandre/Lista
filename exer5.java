public class numerosprimos {

public static void main(String[] args) {   
        
Integer x,y,numero;
  for ( x = 2; x <= 123; x++) {
    if( Primo(x) )
    System.out.println(x + " esse numero é primo.");
            }    
        }
     
   private static boolean Primo( int numero) {
       for (int y = 2; y < numero; y++) {
          if (numero % y == 0)
             return false;   
            }
            return true;
        }
    }