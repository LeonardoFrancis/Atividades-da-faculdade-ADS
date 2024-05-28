package mediaimpares;

import java.util.Scanner;

public class MediaImpares {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número inicial: ");
        int numeroInicial = entrada.nextInt();
        
        System.out.print("Digite o número inicial: ");
        int numeroFinal = entrada.nextInt();
        
        int i = numeroInicial;
        int somador = 0;
        double resultado;
        
        while (i <= numeroFinal) {
            if (i % 2 != 0) {
                somador += i;
            }
            i++;
        }
        resultado = (double) somador / 2;
        System.out.println("A média é: " + resultado);
    }
    
}
