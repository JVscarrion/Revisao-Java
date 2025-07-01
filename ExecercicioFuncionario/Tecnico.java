public class Tecnico extends Funcionarios{
    protected String tipo;
    protected double salarioFinal;

    public Tecnico(String matricula, String nome, String sexo, int idade, double salario, String tipo){
        super(matricula, nome, sexo, idade, salario);
        this.tipo = tipo;


    }

    @Override
    public void calcularSalario() {
        salarioFinal = salario * 1.10;
    }

    @Override
    public void monstrarInfo() {
        super.monstrarInfo();
        System.out.println("Tipo: "+tipo);
    }
}
