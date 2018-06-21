package DAO;

import MODEL.Agenda;
import MODEL.Pessoa;
import java.util.ArrayList;

public class AgendaDAO {
    //cria uma agenda 

    private ArrayList<Agenda> agenda = new ArrayList();

    public AgendaDAO() {
        //Adicionando pessoas
        
       
    }

    public ArrayList<Agenda> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList agenda) {
        this.agenda = agenda;
    }

    public void adicionarAgenda(Agenda g) {
        agenda.add(g);
    }

    public Agenda retornaAgenda(int i) {
        return agenda.get(i);
    }

    public int tamanho() {
        return agenda.size();
    }

    // GET AND SET--------------------------------------------
    @Override
    public String toString() {
        return "Agenda{" + agenda + '}';
    }
}
