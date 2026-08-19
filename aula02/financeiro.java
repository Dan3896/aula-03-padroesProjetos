package aula02;

public class financeiro {
    private double totalBonus = 0;

    public void computaBonus(funcionario g){
        this.totalBonus += g.getBonificacao();
    }


    public double getTotalBonus(){
        return this.totalBonus;
    } 
}
