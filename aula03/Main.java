package aula03;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        DisciplinaEspecializacao de = new DisciplinaEspecializacao();

        a.setNome("Daniel");
        de.setNome("matematica");
        de.setNota("A");
        a.matricular(de);
        System.out.println("o aluno esta aprovado? " + a.estaAprovado(de));
    }
}
