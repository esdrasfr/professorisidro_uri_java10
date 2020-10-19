import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int distancia;
        float litros, consumoMedio;

        distancia = teclado.nextInt();
        litros    = teclado.nextFloat();

        consumoMedio = distancia / litros;

        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}