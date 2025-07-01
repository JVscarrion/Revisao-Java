public class Supervisor extends Funcionarios {
    protected String setor;
    protected double salarioFinal;

    public Supervisor(String matricula, String nome, String sexo, int idade, double salario, String setor) {
        super(matricula, nome, sexo, idade, salario);
        this.setor = setor;

    }

    @Override
    public void calcularSalario() {
        salarioFinal = salario * 1.15;
    }

    @Override
    public void monstrarInfo() {
        super.monstrarInfo();
        System.out.println("Setor: "+setor);
    }
}
