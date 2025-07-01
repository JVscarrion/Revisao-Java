import  java.util.Scanner;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();

        boolean programa = true;

        while (programa){
            System.out.println("\n----Menu de Serviços----");
            System.out.println("\n1 - Casdastrar Funcionario");
            System.out.println("\n2 - Monstrar informações do funcionario");
            System.out.println("\n3 - Sair do programa");
            System.out.println("\n Sair do Programa");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.print("Digite a matricula do Funcionario: ");
                    String matricula = sc.nextLine();
                    System.out.print("Digite o nome do funcionario: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o sexo do funcionario: ");
                    String sexo = sc.nextLine();
                    System.out.print("Digite a idade do funcionario: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o salario do funcionario: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    Funcionarios newFuncionario = null;

                    int cargo = sc.nextInt();
                    sc.nextLine();


                    if ( cargo == 1) {
                        System.out.print("Digite o setor do funcionario: ");
                        String setor = sc.nextLine();
                        newFuncionario = new Supervisor(matricula, nome, sexo, idade, salario,setor);

                    } else if ( cargo == 2){
                        System.out.print("Digite as informações do Engenheiro:");
                        String areaAtuacao = sc.nextLine();
                        newFuncionario = new Engenheiro(matricula, nome, sexo, idade, salario,areaAtuacao);

                    } else if ( cargo == 3) {
                        System.out.print("Digite as informações do Tecnico: ");
                        String tipo = sc.nextLine();
                        newFuncionario = new Tecnico(matricula, nome, sexo, idade, salario,tipo);
                    }else{
                        System.out.println("Cargo inválido !");
                        break;
                    }

                    listaFuncionarios.add(newFuncionario);
                    System.out.println("\nFuncionarios Cadastrados com sucesso! ");
                    break;


                case 2:
                    System.out.println("Informações dos Funcionarios");
                    for (Funcionarios funcionarios  : listaFuncionarios){
                        funcionarios.calcularSalario();
                        funcionarios.monstrarInfo();
                    }
                    break;
                case 3:
                    programa = false;
                    break;

                default:
                    System.out.println("Opção Invalida!");
            }
        }
        sc.close();

        System.out.println("Programa Encerrado");
    }
}