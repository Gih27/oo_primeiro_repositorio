package avt13_03;
import avt13_03.Cachorro;
import avt13_03.Pessoa;

public class Main {
    
    public static void main(String[] arg){

        Cachorro cachorro = new Cachorro("Tob",null, "Branco", null);
        Cachorro cachorro2 = new Cachorro(null, null, null, null);
        Cachorro cachorro3 = new Cachorro(null, null, null, null);

        Pessoa pessoa = new Pessoa("Adryann", "xxxxxxx", 17);

        pessoa.getCachorros().add(cachorro2);
        pessoa.getCachorros().add(cachorro3);
        pessoa.getCachorros().add(cachorro);

        System.out.println("Teste isEmpy");
        System.out.println(pessoa.getCachorros().isEmpty());
        System.out.println(pessoa.getCachorros().size());

    }
}
