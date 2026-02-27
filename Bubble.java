import java.util.Scanner;

public class Bubble {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[5];
        int mesa = 0;

        System.out.println("Digite 5 números: ");
        for(int a=0; a<5; a++){
            vetor[a] = scan.nextInt();
        }
        System.out.println("Vetor atual: ");
        for(int b= 0; b< 5; b++){
            System.out.printf(vetor[b] + ",");
        }
         
        for(int a=0; a< 5 ;a++){
            for(int b=1; b< 4; b++){
                if(vetor[b] > vetor[b+1]){
                    
                    mesa = vetor[a];
                    vetor[a]= vetor[b+1];
                    vetor[b+1] = mesa;

                }
            }
        }

        System.out.printf("\n\nVetor depois: ");
        System.out.printf("[");
        for(int a=0;a < 5 ;a++){
            System.out.printf(","+vetor[a]);
        }
        System.out.printf("]");

    }
}
