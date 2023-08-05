package br.senai.sp.form;

import java.util.Scanner;

public class form {
    public static void main(String[] args) {

        /** Declaração das variaveis */
        //String nome;
        //int idade;
        //int peso;
        //float altura;
        //int rg;
        //long cpf;
        //String profissao;
        //String curso;

        /** import da class scanner */
        Scanner teclado = new Scanner(System.in);

        /** Coleta de dados do user */
        //System.out.println("--------------------------------------");
        //System.out.println("--------------Formulario--------------\n");

        //System.out.println("Por favor digite o seu nome");
        //String nome = teclado.nextLine();
        //System.out.println("Digite sua idade");
        //int idade = teclado.nextInt();
        //System.out.println("Digite seu peso");
        //int peso = teclado.nextInt();
        //System.out.println("Digite sua altura");
        //float altura = teclado.nextFloat();
        //System.out.println("Digite seu RG");
        //int rg = teclado.nextInt();
        //ystem.out.println("Digite seu CPF");
        //long cpf = teclado.nextLong();
        //System.out.println("Digite sua profissao");
        //String profissao = teclado.next();
        //System.out.println("Digite o nome do curso");
        //String curso = teclado.next();
        //System.out.print("\n");

        /** Print das informacoes */
        //System.out.println("--------------------------------------\n");
        //System.out.println("Olá " + nome + " Seja bem-vindo!");
        //System.out.println("sua idade é " + idade);
        //System.out.println("seu peso é " + peso);
        //System.out.println("sua altura é " + altura);
        //System.out.println("seu RG é " + rg);
        //System.out.println("seu CPF é " + cpf);
        //System.out.println("sua profissão é " + profissao);
        //System.out.println("seu curso é " + curso + "\n");
        //System.out.println("--------------------------------------");

        /** Coleta de dados dos professores */
        String [] nomes = new String[2];
        int [] idades = new int[2];
        int [] peso = new int[2];
        float [] altura = new float[2];
        int [] rg = new int[2];
        long [] cpf = new long[2];
        String [] cursos = new String[2];

        System.out.println("Digite o nome do professor 1 ");
        nomes[0] = teclado.nextLine();
        System.out.println("Digite o nome do professor 2 ");
        nomes[1] = teclado.nextLine();
        System.out.println("Digite a idade do professor 1 ");
        idades[0] = teclado.nextInt();
        System.out.println("Digite a idade do professor 2 ");
        idades[1] = teclado.nextInt();
        System.out.println("Digite o peso do professor 1 ");
        peso[0] = teclado.nextInt();
        System.out.println("Digite o peso do professor 2 ");
        peso[1] = teclado.nextInt();
        System.out.println("Digite a altura do professor 1 ");
        altura[0] = teclado.nextFloat();
        System.out.println("Digite a altura do professor 2 ");
        altura[1] = teclado.nextFloat();
        System.out.println("Digite o RG do professor 1 ");
        rg[0] = teclado.nextInt();
        System.out.println("Digite o RG do professor 2 ");
        rg[1] = teclado.nextInt();
        System.out.println("Digite o CPF do professor 1 ");
        cpf[0] = teclado.nextLong();
        System.out.println("Digite o CPF do professor 2 ");
        cpf[1] = teclado.nextLong();
        System.out.println("Digite o curso do professor 1 ");
        cursos[1] = teclado.next();
        System.out.println("Digite o curso do professor 2 ");
        cursos[0] = teclado.next();

        /** Print das informacoes */
        System.out.print("Olá " + nomes[0] + " e " + nomes[1] + " sejam bem-vindos\n");
        System.out.println(nomes[0] + " confira os dados cadastrados:");
    }
}