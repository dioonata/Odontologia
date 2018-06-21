package MODEL;

/**
 *
 * @author tads
 */
public class Agenda {

    private String data;
    private String hora;
    private Pessoa pessoa;

    public Agenda(Pessoa pessoa,String data, String hora) {
        this.pessoa = pessoa;
        this.data = data;
        this.hora = hora;
    }
    
    public Agenda(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    public Pessoa getPessoa()
    {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa)
    {
        this.pessoa = pessoa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
