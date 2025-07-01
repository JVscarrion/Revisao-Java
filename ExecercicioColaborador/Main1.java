import java.util.Scanner;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Colaborador> listaColaborador = new ArrayList<>();

        boolean programa = true;

        while(programa){
            System.out.println("\n-----Menu de Gerenciamento de Colaboradores-----"); // CORRIGIDO: nome do menu
            System.out.println("1 - Cadastrar Colaborador"); // CORRIGIDO: nome da opção
            System.out.println("2 - Exibir informações dos Colaboradores");
            System.out.println("3 - Sair do Programa");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.print("Digite o codigo do Colaborador: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o nome do Colaborador: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o telefone do Colaborador: ");
                    String telefone = sc.nextLine();
                    System.out.print("Digite o Salário do Colaborador: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    // ADICIONADO: Pergunta sobre o cargo
                    System.out.println("Escolha o cargo:");
                    System.out.println("1 - Gerente");
                    System.out.println("2 - Vendedor");
                    System.out.println("3 - Assistente");
                    System.out.print("Digite o cargo (1-3): ");

                    Colaborador newColaborador = null;
                    int cargo = sc.nextInt();
                    sc.nextLine();

                    if (cargo == 1){
                        System.out.print("Digite o valor do Bonus: ");
                        double bonus = sc.nextDouble();
                        sc.nextLine();
                        newColaborador = new Gerente(codigo, nome, telefone, salario, bonus);
                    } else if (cargo == 2) {
                        System.out.print("Digite o valor da Comissão: "); // CORRIGIDO: Vendedor recebe comissão
                        double comissao = sc.nextDouble();
                        sc.nextLine();
                        newColaborador = new Vendedor(codigo, nome, telefone, salario, comissao);
                    } else if (cargo == 3) {
                        System.out.print("Digite o valor do Vale Transporte: "); // CORRIGIDO: Assistente recebe vale transporte
                        double valeTransporte = sc.nextDouble();
                        sc.nextLine();
                        newColaborador = new Assistente(codigo, nome, telefone, salario, valeTransporte);
                    }else{
                        System.out.println("Cargo do Colaborador Inválido!");
                        break;
                    }
                    listaColaborador.add(newColaborador);
                    System.out.println("Colaborador cadastrado com sucesso!");
                    break;

                case 2:
                    if(listaColaborador.isEmpty()) { // ADICIONADO: verificação se lista está vazia
                        System.out.println("Nenhum colaborador cadastrado!");
                        break;
                    }
                    System.out.println("Informações dos Colaboradores:");
                    for (Colaborador colaborador : listaColaborador){
                        colaborador.calcularSalarios();
                        colaborador.exibirinfo();
                        System.out.println("-------------------"); // ADICIONADO: separador visual
                    }
                    break;
                case 3:
                    programa = false;
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        }
        sc.close();

        System.out.println("Programa Encerrado!");
    }
}
