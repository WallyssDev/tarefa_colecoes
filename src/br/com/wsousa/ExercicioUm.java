package br.com.wsousa;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExercicioUm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separando-os por vírgula: ");

        String nome = s.nextLine();
        String[] listaDeNomes =  nome.split(",");
        Arrays.sort(listaDeNomes);

        for (String listaDeNome : listaDeNomes) {
            System.out.println(listaDeNome);

        }
    }
}