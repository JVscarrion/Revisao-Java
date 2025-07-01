public class Funcionarios {
    protected String matricula;
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double salario;

    public Funcionarios(String matricula, String nome, String sexo, int idade, double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.salario = salario;
    }

    public void monstrarInfo(){
        System.out.println("Informações Gerais");
        System.out.println("Matrícula:  "+matricula);
        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade);
        System.out.println("Salario: "+salario);
    }

    public void calcularSalario(){

    }
}
