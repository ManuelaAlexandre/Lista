import javax.swing.JOptionPane;;
    public class exer10{    
public static void main(String[] args) {
    String aux= "";
    float peso= 0, altura= 0, imc= 0;
    try{
        aux=JOptionPane.showInputDialog(null,"Entre com o peso: ");
        peso = Float.parseFloat(aux);

        aux=JOptionPane.showInputDialog(null, "Entre com a altura: ");
        altura = Float.parseFloat(aux);

        imc = peso/(altura*2);
   
        if (imc < 18.5)
     JOptionPane.showMessageDialog(null, "Seu imc é de " + imc +" sua categoria é Abaixo do normal ");
    else
    if ((imc > 18.5) &&(imc <24.4))
     JOptionPane.showMessageDialog(null, "Seu imc é de " + imc +" sua categoria é Peso ideal");
    else
    if ((imc > 24.5)&& (imc <29.9))
       JOptionPane.showMessageDialog(null, "Seu imc é de " + imc +" sua categoria é Pré-Obesidade");
    else
    if ((imc > 30.0) && (imc <34.9))
        JOptionPane.showMessageDialog(null, "Seu imc é de " + imc +" sua categoria é Obesidade classe I");
    else
    if ((imc > 35.0) && (imc <39.9))
       JOptionPane.showMessageDialog(null, "Seu imc é de " + imc +" sua categoria é Obesidade severa");
    else 
    if (imc >= 40)
       JOptionPane.showMessageDialog(null, "Seu imc é de " + imc +" sua categoria é Obesidade mórbida");

    }
    catch (NumberFormatException erro){
        JOptionPane.showMessageDialog(null, "Valor incorreto: ");
    }
    }
    }

