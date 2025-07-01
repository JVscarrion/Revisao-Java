public class Gerente  extends  Colaborador{
    protected  double Bonus;
    protected double salarioFinal;

    public Gerente (int codigo, String nome, String telefone, double salario, double Bonus){
        super(codigo, nome, telefone, salario );
        this.Bonus = Bonus;

    }

    @Override
    public void calcularSalarios() {
       salarioFinal  = salario + Bonus;
    }

    @Override
    public void exibirinfo() {
        super.exibirinfo();
        System.out.println("Bonus: "+Bonus);

    }
}
