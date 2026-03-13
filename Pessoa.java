package avt13_03;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String cpf;
    private Integer idade;
    private List<Cachorro> cachorros;

    public Pessoa(String nome, String cpf, Integer idade){
        this.nome =nome;
        this.cpf= cpf;
        this.idade = idade;
        this.cachorros = new ArrayList<>(); 
    }

    public List<Cachorro> getCachorros(){
        return this.cachorros;
    }
}




