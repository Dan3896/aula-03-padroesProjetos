public class funcionario {
    protected String nome;
    protected String cpf;
    protected Double salario;
    protected String senha;

    public double getBonificacao(){
        return this.salario * 0.15;
    }

    public boolean autentica(String senha){

        return (this.senha.equals(senha));
    }
}