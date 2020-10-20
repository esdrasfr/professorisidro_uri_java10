import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, hF, mI, mF, tI, tF, dur, durH, durM;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // passo 1 - converter tudo para a menor unidade possível (minutos)
        tI = hI * 60 + mI;
        tF = hF * 60 + mF;

        // passo 2 - calcular a duração
        dur = tF - tI;

        if (dur <= 0){
            dur = dur + 24 * 60; // se a duração for zero ou negativa, somo 24h (em minutos)
        }

        // passo 3 - desconverto
        durH = dur / 60;
        durM = dur % 60;

        System.out.println("O JOGO DUROU "+durH+" HORA(S) E "+durM+" MINUTO(S)");
    
    }

}