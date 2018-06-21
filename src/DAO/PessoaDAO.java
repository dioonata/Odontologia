package DAO;

import MODEL.Pessoa;
import MODEL.Pessoa;
import java.util.ArrayList;

public class PessoaDAO {

    private ArrayList<Pessoa> pessoas = new ArrayList();
    
    public PessoaDAO() {
        //Adicionando pessoas
        this.adicionarPessoas(new Pessoa("Dioônata", "996725280"));
        this.adicionarPessoas(new Pessoa("Daniel", "005489211"));
        this.adicionarPessoas(new Pessoa("Antonio", "40028922" ));

    }
    
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList cliente) {
        this.pessoas = cliente;
    }

    public void adicionarPessoas(Pessoa p) {
        pessoas.add(p);
    }

    public Pessoa retornaPessoas(int i) {
        return pessoas.get(i);
    }

    public int tamanho() {
        return pessoas.size();
    }

    
    // GET AND SET--------------------------------------------

    @Override
    public String toString() {
        return "Agenda{" + "cliente=" + pessoas + '}';
    }
}
