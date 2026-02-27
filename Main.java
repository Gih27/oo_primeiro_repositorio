public class Main{  
    public static void main (String[] arg){

        int mesa = 0;

        // ordenação 
        // entrada
        // [7,6,4,3,2]
        int[] vetor = {7,6,4,3,2};

        System.out.println("Vetor antes: ");
        System.out.println("[");
        for(int a=0;a < 5 ;a++){
            System.out.println(","+vetor[a]);
        }
        System.out.println("]");

        //saída 
        //[2,3,4,6,7]
        for(int a=0; a< 5 ;a++){
            for(int b=1; b< 4; b++){
                if(vetor[b] > vetor[b+1]){
                    
                    mesa = vetor[a];
                    vetor[a]= vetor[b+1];
                    vetor[b+1] = mesa;

                }
            }
        }

        System.out.println("Vetor depois: ");
        System.out.println("[");
        for(int a=0;a < 5 ;a++){
            System.out.println(","+vetor[a]);
        }
        System.out.println("]");

    }
}
