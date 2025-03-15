import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args){
        float altura, peso;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua altura:");
        altura = entrada.nextFloat();
        System.out.print("Digite seu peso:");
        peso = entrada.nextFloat();

        float imc = peso/(altura*altura);

        System.out.println("Seu peso é: "+peso+", sua altura é: "+altura+" e seu imc é: "+imc);
        
    }
}
