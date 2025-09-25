package br.com.wsousa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes e o sexos da pessoa sendo m=Masculino e f=Femenino (EX: Pedro - m, Clara - f...): ");
        String nome = s.nextLine();
        String[] nomesSexos = nome.split(",");
//        Arrays.sort(nomesSexos);

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        for(String nomesSexo : nomesSexos){
            nomesSexo = nomesSexo.trim();
            System.out.println(nomesSexo.trim());
            if(nomesSexo.toLowerCase().contains("- m")){
                String[] partes = nomesSexo.split("-");
                grupoMasculino.add(partes[0].trim());
            }else if(nomesSexo.toLowerCase().contains("- f".toLowerCase())){
                String[] partes = nomesSexo.split("-");
                grupoFeminino.add(partes[0].trim());
            }
        }

        System.out.println("\n**** Grupo Masculino **** ");
        for(String masculino : grupoMasculino){
            System.out.println(masculino);
        }
        System.out.println("\n**** Grupo Feminino **** ");
        for(String feminino : grupoFeminino){
            System.out.println(feminino);
        }

        s.close();



    }
}
