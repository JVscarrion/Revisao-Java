public class Assistente extends Colaborador {
    protected double valeTransporte;
    protected double salarioFinal;

    public Assistente(int codigo,String nome, String telefone, double salario, double valeTransporte){
        super(codigo, nome, telefone, salario);
        this.valeTransporte = valeTransporte;

    }

    @Override
    public void calcularSalarios() {
        salarioFinal = salario + valeTransporte;
    }

    @Override
    public void exibirinfo() {
        super.exibirinfo();
        System.out.println("Vale Transporte: "+valeTransporte);
    }
}
