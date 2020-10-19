import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int tempoTotal, horas, minutos, segundos, resto;

        tempoTotal = teclado.nextInt();
        horas      = tempoTotal / 3600;

        resto      = tempoTotal % 3600;

        minutos    = resto / 60;
        segundos   = resto % 60;

        System.out.println(horas+":"+minutos+":"+segundos);


    }
}