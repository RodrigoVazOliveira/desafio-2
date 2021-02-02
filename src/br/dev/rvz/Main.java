package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] agenda = new String[3];

        System.out.println("Bem vindo ao sistema de agenda!");
        System.out.println("Por favor, digite o nome, telefone e email");

        agenda[0] = in.nextLine();
        agenda[1] = in.nextLine();
        agenda[2] = in.nextLine();

        System.out.println("Nome: " + agenda[0] + "\nTelefone: " + agenda[1] + "\nE-Mail: " + agenda[2]);
    }
}
