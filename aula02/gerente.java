package aula02;

import java.util.function.BooleanSupplier;

public class gerente extends funcionario {
    public int numeroDeFuncionarioGerenciados;

    @Override
    public double getBonificacao(){
        // return this.salario * (0.2 * this.numeroDeFuncionarioGerenciados);
        //double bonusBase = super.getBonificacao();
        double bonusAdicional = 0.2 * this.numeroDeFuncionarioGerenciados;
        return bonusAdicional;
    }
}
