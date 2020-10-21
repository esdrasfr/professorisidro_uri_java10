import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        if (numero %2 == 0){  // se ele é par, torno-o o próximo número (que é impar)
            numero++;
        }

        for (int cont=1; cont<= 6; cont++){
            System.out.println(numero);
            numero = numero + 2;
        }
    }
}