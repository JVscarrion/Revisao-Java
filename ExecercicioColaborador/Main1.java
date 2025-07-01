import java.util.Scanner;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Colaborador>  listaColaborador = new ArrayList<>();

        boolean programa = true;

        while(programa){
            System.out.println("\n-----Menu de Gerenciamento de Vendas-----");
            System.out.println("\n 1 - Calcular o salario dos Colaboradores");
            System.out.println("\n 2 - Exibir informações dos  Colaboradores");
            System.out.println("\n 3 - Sair do Programa");

            int op  = sc.nextInt();
            sc.nextLine();


            switch (op){
                case 1:
                    System.out.print("Digite o codigo do Colaborador: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o nome do Colaborador:  ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o telefone do Colaborador: ");
                    String telefone = sc.nextLine();
                    System.out.print("Digite o Sálario do Colaborador:  ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    Colaborador newColaborador = null;
                    int cargo = sc.nextInt();
                    sc.nextLine();


                    if (cargo == 1){
                        System.out.print("Digite o valor do Bonus: ");
                        double Bonus = sc.nextDouble();
                        sc.nextLine();
                        newColaborador = new Gerente(codigo, nome, telefone,salario,Bonus);
                    } else if (cargo == 2) {
                        System.out.print("Digite o valor do Vale Transporte: ");
                        double valeTransporte = sc.nextDouble();
                        sc.nextLine();
                        newColaborador = new Vendedor(codigo, nome, telefone, salario, valeTransporte );
                    } else if (cargo == 3) {
                        System.out.print("Digite o valor da Comissão: ");
                        double comissao = sc.nextDouble();
                        sc.nextLine();
                        newColaborador = new Assistente(codigo, nome, telefone, salario, comissao);
                    }else{
                        System.out.println("Cargo do Colaborador Invalido ! ");
                        break;
                    }
                    listaColaborador.add(newColaborador);
                    System.out.println("\n Colaboradores cadastrados com sucesso !");
                    break;

                case 2:
                    System.out.println("Informações dos Colaboradores");
                    for (Colaborador colaborador : listaColaborador){
                        colaborador.calcularSalarios();
                        colaborador.exibirinfo();
                    }
                    break;
                case 3:
                    programa = false;
                    break;

                default:
                    System.out.println("Opção Invalida");
            }
        }
        sc.close();

        System.out.println("Programa Encerrado ! ");
    }
}
