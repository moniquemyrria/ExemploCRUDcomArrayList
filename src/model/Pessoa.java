
package model;

/**
 *
 * @author Monique
 */
public class Pessoa {
    
    private String nome;
    private int rg;
    private String cpf;

    public Pessoa(){
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}


