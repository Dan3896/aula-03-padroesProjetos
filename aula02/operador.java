package aula02;

public class operador extends funcionario{

    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }
    
}
