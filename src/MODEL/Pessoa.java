package MODEL;

public class Pessoa {

    private String nome;
    private String telefone;
    Agenda agenda;

    public Pessoa(Agenda agenda, String nome, String telefone) {
        this.agenda = agenda;
        this.nome = nome;
        this.telefone = telefone;

    }
    
    public Pessoa(String nome, String telefone) {

        this.nome = nome;
        this.telefone = telefone;

    }

    

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    
    
}
