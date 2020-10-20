import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float a, b, c, res;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        if (a + b > c && a + c > b && b + c > a){
            res = a + b + c;
            System.out.printf("Perimetro = %.1f\n", res);
        }
        else{
            res = (a + b) * c / 2;
            System.out.printf("Area = %.1f\n", res);
        }
    }
}