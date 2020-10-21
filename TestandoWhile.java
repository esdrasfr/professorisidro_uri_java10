public class TestandoWhile{
    public static void main(String args[]){
        int valor=0; // ->> aqui eu defini o início

        /* enquanto a condição lógica for verdadeira, vou executar o que estiver no bloco */
        while (valor <= 10 ){  // ->> aqui eu defini a condição para continuar
            System.out.println("Valor = "+valor);
            valor = valor + 2;      // ->> aqui eu defini o quanto esse valor varia
        }

        System.out.println("****** FIM DO PROGRAMA ********");
    }
}