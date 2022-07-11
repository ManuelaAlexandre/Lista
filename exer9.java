import javax.swing.JOptionPane;
 import java.util.*;
       public class exer9{
       
        public static void main(String[] args) {

            Scanner recebe = new Scanner(System.in);
    int idade;

    System.out.println("informe sua idade");
    idade =recebe.nextInt();
    

    if (idade <=3) {
      JOptionPane.showMessageDialog
      (null, "Sua idade é:" + idade + "e você é um bebe");}

    if ((idade >= 4) && (idade <= 9)) {
        JOptionPane.showMessageDialog
        (null, "Sua idade é:" + idade + "e você é uma criança");}

    if ((idade >= 10) && (idade <= 13)) {
        JOptionPane.showMessageDialog
        (null,"Sua idade é:" + idade + "e você é um pre-adoslecente");}

    if ((idade >= 13) && (idade <= 17)) {
        JOptionPane.showMessageDialog
        (null,"Sua idade é:" + idade + "e você é um adoslecente");}

    if ((idade >= 18) && (idade <= 24)) {
        JOptionPane.showMessageDialog
        (null,"Sua idade é:" + idade + "e você é um jovem");}

    if ((idade >= 25) && (idade <= 50)) {
        JOptionPane.showMessageDialog
        (null,"Sua idade é:" + idade + "e você é um adulto");}

    if (idade >= 51) 
        JOptionPane.showMessageDialog
        (null,"Sua idade é:" + idade + "e você é um idoso");}

    }


 
   