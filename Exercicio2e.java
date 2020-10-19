import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double baseMaior, baseMenor, altura, area;

        System.out.print("Informe a base maior : ");
        baseMaior = teclado.nextDouble();
        System.out.print("Informe a base menor : ");
        baseMenor = teclado.nextDouble();
        System.out.print("Informe a altura     : ");
        altura = teclado.nextDouble();

        area = (baseMaior + baseMenor) * altura / 2;

        System.out.printf("A area vale %.3f\n", area);
    }
}