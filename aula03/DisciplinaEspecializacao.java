package aula03;

public class DisciplinaEspecializacao extends Disciplina {
    public String nota;

    public void setNota(String c){
        this.nota = c;
    }

    @Override
    public boolean estaAprovado(){
        return !this.nota.equals("D");
    }; 
}
