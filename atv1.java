import java.util.Scanner;
import java.util.Random;

public class atv1{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tentativas = 0;
        int fim = 0;

        Random gerador = new Random();
        // Gera um número inteiro entre 0 (inclusivo) e 100 (exclusivo): 0 a 99
        int numero = gerador.nextInt(100) + 1;

        do{
            System.out.println("");
            System.out.println("Digite um número de 1 a 100: ");
            int n = scan.nextInt();
           
            if(numero == n){
                System.out.println("Acertou!!!");
                fim = 1;
            }

            else if(n < numero){
                System.out.println("O numero é maior q "+ n);
            }

            else{
                System.out.println("O numero é menor q "+n);
            }

            tentativas++;

        }while(fim == 0);

        System.out.println("Parabens o numero era "+ numero);
        System.out.println("suas tentatativas foram: "+ tentativas);


    }
}