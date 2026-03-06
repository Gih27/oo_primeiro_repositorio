package models;

public class Cachorro {
    private String cor;
    private String som;
    private String nome;
    private String raca;
    private Integer idade;
    private Double peso;

    public Cachorro(String nome, Integer idade, String cor, String som ){
        this.nome =nome;
        this.idade = idade;
        this.cor = cor;
        this.som = som; 
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }

    public String getNome(){
        return this.nome;
    }

    public void setCor(String cor){
        this.cor = cor; 
    }

    public String getCor(){
        return this.cor;
    }

    public void setRaca(String raca){
        this.raca = raca; 
    }

    public String getRaca(){
        return this.raca;
    }

    public void setIdade(Integer idade){
        this.idade = idade; 
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void setPeso(Double peso){
        this.peso = peso; 
    }

    public Double getPeso(){
        return this.peso;
    }

    public String toString(){
        return "nome: "+ this.nome + "\n" + this.cor;
    }


}

