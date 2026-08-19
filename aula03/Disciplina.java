package aula03;

public abstract class Disciplina {
    public String nome;
    public int cargaHoraria;

    public abstract boolean estaAprovado(); 

    public void setNome(String nome){
        this.nome = nome;
    }
    public void cargaHoraria(int c){
        this.cargaHoraria = c;
    }
}
