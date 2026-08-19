package aula02;

public class teste {
    public static void main(String[] args) {
        gerente cord = new gerente();
        gerente cord1 = new gerente();
        operador opr = new operador();

        cord.nome = "Araci de almeida";
        cord1.nome = "Marcio de almeida";
        opr.nome = "Marcio de almeida";
        cord.salario = 10000;
        cord1.salario = 8000;
        opr.salario = 2000;
        cord.numeroDeFuncionarioGerenciados = 10;
        cord1.numeroDeFuncionarioGerenciados = 5;

        financeiro f = new financeiro();

        System.out.println(cord.getBonificacao());

        f.computaBonus(cord);
        f.computaBonus(cord1);
        f.computaBonus(opr);

        funcionario func = new gerente();
        func.nome = "silvio";
        func.salario = 20000;

        f.computaBonus(func);

        System.out.println(f.getTotalBonus());

        
    }
}

