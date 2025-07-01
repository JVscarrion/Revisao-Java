public class Vendedor extends Colaborador{
    protected double comissao;
    protected  double salarioFinal;

    public Vendedor(int codigo, String nome, String telefone, double salario, double comissao){
        super(codigo, nome, telefone, salario);
        this.comissao = comissao;

    }

    @Override
    public void calcularSalarios() {
        salarioFinal = salario + comissao;
    }

    @Override
    public void exibirinfo() {
        super.exibirinfo();
        System.out.println("Comissão: "+comissao);
    }
}
