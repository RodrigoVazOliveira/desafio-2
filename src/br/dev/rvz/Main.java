package br.dev.rvz;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continuar = true;
        Map<String, List<String>> agenda = new HashMap<>();
        int opcao;

        System.out.println("Bem vindo ao sistema de agenda!");

        while (continuar) {
            System.out.println("1. Deseja adicionar novo contato.\n2. Sair do sistema.");
            opcao = Integer.parseInt(in.nextLine());

            if (opcao == 1) {
                System.out.println("Digite o nome, telefone e email: ");
                String name = in.nextLine();
                String telefone = in.nextLine();
                String email  = in.nextLine();
                agenda.put(email, Arrays.asList(name, telefone));
            } else if (opcao == 2) {
                continuar = false;
            }
        }

        int sizeAgenda = agenda.size();

        for (Map.Entry contato: agenda.entrySet()) {
            System.out.println("==============================================");
            List<String> dados =  (List) contato.getValue();
            System.out.println("Nome: " + dados.get(0) + "\nTelefone: " + dados.get(1) + "\nE-Mail: " + contato.getKey());
        }
    }
}
