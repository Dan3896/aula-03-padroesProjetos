package aula03;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public String nome;
    public int rgm;
    public List<Disciplina> disciplinas = new ArrayList<>();

    public boolean estaAprovado(Disciplina d){
        return d.estaAprovado();
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void matricular(Disciplina d){
        this.disciplinas.add(d);
    }
}
