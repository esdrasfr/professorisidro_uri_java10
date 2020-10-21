import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float numero;
        int qtdPositivos = 0;
        float media, soma;

        soma = 0; // soma inicialmente vale 0 pq vou acumular nela os valores positivos

        //System.out.println(" --DEBUG:  soma = "+soma+"   positivos = "+qtdPositivos);
        for (int cont=1; cont <= 6 ; cont++){  // este cabeçalho indica que vou contar até 6
            numero = teclado.nextFloat(); // leio cada numero
            if (numero > 0){              // o numero é positivo?
                qtdPositivos++;           // conto +1 positivo
                soma = soma + numero;     // acumulo na somatória o numero lido
               // System.out.println(" --DEBUG:  soma = "+soma+"   positivos = "+qtdPositivos);
            }
        }

        // ao final, calculo a média para os positivos
        media = soma / qtdPositivos;
        System.out.println(qtdPositivos + " valores positivos");
        System.out.printf("%.1f\n",media);
    }
}