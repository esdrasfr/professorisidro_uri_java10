import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float base, altura, area;

        // entrada -> pedindo pro usuario informar os valores de base e altura
        System.out.print("Informe a base  :");
        base   = teclado.nextFloat();
        System.out.print("Informe a altura:");
        altura = teclado.nextFloat();

        // processamento -> calcular a área
        area = base * altura / 2;

        // saída
        System.out.println("O valor da area do triangulo é "+area);
        System.out.printf("O valor da área do triangulo é %.4f\n", area);
        System.out.printf("O Triangulo de base %.2f e altura %.2f tem area %.2f\n", base, altura, area);


    }
}