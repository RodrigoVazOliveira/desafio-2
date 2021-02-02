package br.dev.rvz;

import java.util.*;

public class Main {

    private static Map<String, List<String>> removerContato(Map<String, List<String>> agenda, String email) {
        if (agenda.containsKey(email)) {
            List<String> contato = agenda.remove(email);
            System.out.println("foi removido o contato " + contato.get(0) + " com telefone " + contato.get(1));
        } else {
            System.out.println("O E-mail " + email + " não existe na lista");
        }
        return agenda;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continuar = true;
        Map<String, List<String>> agenda = new HashMap<>();
        int opcao;

        System.out.println("Bem vindo ao sistema de agenda!");

        while (continuar) {
            System.out.println("1. Deseja adicionar novo contato.\n2. Excluir contato por e-mail\n3. Sair do sistema.");
            opcao = Integer.parseInt(in.nextLine());

            if (opcao == 1) {
                System.out.println("Digite o nome, telefone e email: ");
                String name = in.nextLine();
                String telefone = in.nextLine();
                String email = in.nextLine();

                if (!agenda.containsKey(email)) {
                    agenda.put(email, Arrays.asList(name, telefone));
                } else {
                    System.out.println("E-mail já existe, favor utilizar outro e-mail, ou excluir o atual.");
                }

            } else if (opcao == 2) {
                System.out.println("Digite o e-mail do contato: ");
                String email = in.nextLine();
                agenda = removerContato(agenda, email);
            } else if (opcao == 3) {
                continuar = false;
            }
        }

        for (Map.Entry contato: agenda.entrySet()) {
            System.out.println("==============================================");
            List<String> dados =  (List) contato.getValue();
            System.out.println("Nome: " + dados.get(0) + "\nTelefone: " + dados.get(1) + "\nE-Mail: " + contato.getKey());
        }
    }




}
