import java.util.Scanner;
public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float area, lado;

        // entrada -> pedir para o usuário informar o valor do lado
        System.out.println("Por favor, informe o valor do lado");
        lado = teclado.nextFloat();

        // processamento --> calcular a área de acordo com a fórmula: area = lado * lado;
        area = lado * lado;

        // saída -> exibir o valor calculado na área
        System.out.println("Valor da area = "+area);
    }
}