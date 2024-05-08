package fatorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        long contador = 1;
        BigInteger fatorial = BigInteger.valueOf(1);
        String resposta;
        
        do {
            System.out.print("Digite o número que deseja saber o fatorial: ");
            long numero = scanner.nextLong();
            
                while (contador <= numero) {
                    BigInteger contador2 = BigInteger.valueOf(contador);
                    fatorial = fatorial.multiply(contador2);
                    contador++;
                }
                
                System.out.println("O fatorial de " + numero + "é: " + fatorial);
                System.out.print("Deseja realizar um novo cálculo? [S/N] ");
                resposta = scanner.next();
                
        } while (resposta.equals("s"));
    }
    
}
