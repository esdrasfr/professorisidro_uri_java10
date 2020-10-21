import java.util.Scanner;
public class Uri1067{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();
        for (int num = 1; num <= X; num+=2){
            System.out.println(num);
        }
    }
}