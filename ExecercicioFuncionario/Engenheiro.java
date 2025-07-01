public class Engenheiro extends Funcionarios{
    protected String areaAtuacao;
    protected double salarioFinal;

    public Engenheiro (String matricula, String nome, String sexo, int idade, double salario, String areaAtuacao){
        super(matricula, nome, sexo, idade, salario);
        this.areaAtuacao = areaAtuacao;

    }

    @Override
    public void calcularSalario() {
        salarioFinal = salario * 1.15;
    }

    @Override
    public void monstrarInfo() {
        super.monstrarInfo();
        System.out.println("Área Atuação"+areaAtuacao);
    }
}

