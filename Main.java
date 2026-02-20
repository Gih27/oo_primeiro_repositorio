import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);

        Boolean ehDeMaior = false;

        System.out.println("");
        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("");
        System.out.println("Digite sua Altura: ");
        double altura = scan.nextDouble();
       
        System.out.println("");
        System.out.println("Digite sua Idade: ");
        int idade = scan.nextInt();

        System.out.println("");
        System.out.println("Seu nome é: " + nome + ", sua altura é: " + altura + ", sua idade é: " + idade + " anos");
        System.out.println("");

        if(idade >= 18){
            System.out.println("Vc É de maior :)");
        }
        else{
            System.out.println("Vc É de menor :(");
        }*/

    int[] vetor;

    vetor = new int[10];

    for(int a = 0; a < 10; a++){
        vetor[a] = a+1;
        System.out.println("Valor do Vetor: "+ vetor[a] +"  Posição: "+ a);
    }

    }
}
