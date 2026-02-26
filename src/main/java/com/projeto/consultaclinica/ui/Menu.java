package com.projeto.consultaclinica.ui;

import com.projeto.consultaclinica.model.Paciente;
import com.projeto.consultaclinica.servicos.PacienteService;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static PacienteService service = new PacienteService();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Listar pacientes");
            System.out.println("3 - Atualizar paciente");
            System.out.println("4 - Remover paciente");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    service.criarPaciente(new Paciente(id, nome, idade, telefone));
                    break;
                case 2:
                    List<Paciente> pacientes = service.listarPacientes();
                    for (Paciente p : pacientes) {
                        System.out.println(
                                p.getId() + " - " + p.getNome() + ", " + p.getIdade() + " anos, " + p.getTelefone());
                    }
                    break;
                case 3:
                    System.out.print("ID do paciente a atualizar: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Nova idade: ");
                    int novaIdade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTelefone = sc.nextLine();
                    service.atualizarPaciente(idAtualizar, novoNome, novaIdade, novoTelefone);
                    break;
                case 4:
                    System.out.print("ID do paciente a remover: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();
                    service.deletarPaciente(idRemover);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    
            }
        } while (opcao != 0);
    }
}