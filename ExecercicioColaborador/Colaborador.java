public class Colaborador {
    protected int codigo;
    protected String nome;
    protected String telefone;
    protected double salario;

    public Colaborador(int codigo, String nome, String telefone, double salario){
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;

    }

    public void calcularSalarios(){
    }

    public void exibirinfo(){
        System.out.println("Codigo:"+codigo);
        System.out.println("Nome: "+nome);
        System.out.println("Telefone: "+telefone);
        System.out.println("Salário "+salario);
    }
}
