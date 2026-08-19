package aula03;

public class DisciplinaGraduacao extends Disciplina {
    public Double nota;

    public void setNota(Double n){
        this.nota = n;
    }

    @Override
    public boolean estaAprovado(){
        return this.nota >= 7.0;
    }; 
}
