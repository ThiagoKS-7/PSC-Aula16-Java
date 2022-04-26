package br.com.tks;

import java.io.PrintStream;
import java.util.Scanner;

/*
    Classes - substantivos singular maisculo ex Prato
    resto - minusculo
    tudo Camel case
*/
interface GlobalVals{
    int TAM = 2;
}

public class Main implements GlobalVals {
    public static void listaAluno(Aluno[] alunos, PrintStream ps) {
        for (int i = 0; i < 2; i ++ ) {
            ps.print("\n=========================\n");
            ps.print(String.format("=========  Aluno %d    ====\n", (i + 1) ));
            ps.print("=========================\n");
            ps.println(alunos[i].getAluno());
            ps.print("=========================\n\n");
        }

    }
    //mostra um menu na tela e pede uma opção pra o usuario. Se o
    // valor não estiver entre 0 e 3, repete o código
    public static int mainMenu(PrintStream ps, Scanner sc, int opt) {
        ps.print("Menu Principal\n");
        ps.print("==============\n");
        ps.print("1. cadastrar alunos\n");
        ps.print("2. listar alunos\n");
        ps.print("3. excluir aluno\n");
        ps.print("0. sair\n\n");
        //atribui o valor 0 pra variavel opt
        opt = 0;
        do {
            ps.print("informe opcao desejada: ");
            opt = sc.nextInt();
        } while (opt < 0 || opt > 3);

        return opt;
    }
    //pergunta campos e "cadastra" eles num dos students da struct
    public static void registraAluno(PrintStream ps, Scanner sc, Aluno[] students, Avaliacao[] avals) {
        for ( int pos = 0; pos < TAM; pos ++) {
            ps.printf("Informe o campo nome %d:", (pos + 1));
            String tempNome = sc.next();
            ps.printf("Informe o campo matricula  %d:", (pos + 1));
            float tempMatricula = sc.nextInt();
            ps.printf("Informe a nota da prova A1  %d:", (pos + 1));
            float tempA1 = sc.nextFloat();
            ps.printf("Informe a nota da prova A2  %d:", (pos + 1));
            float tempA2 = sc.nextFloat();
            ps.printf("Informe a nota da prova A3  %d:", (pos + 1));
            float tempA3 = sc.nextFloat();
            avals[pos] = new Avaliacao("Soluções Computacionais", tempA1, tempA2, tempA3);
            ps.printf("Matéria: ", avals[pos].getMateria());
            students[pos] = new Aluno(tempNome, (int) tempMatricula,avals[pos].getA1(), avals[pos].getA2(),avals[pos].getA3());
            ps.print("----------------------------\n");
            ps.print("CADASTRO REALIZADO COM SUCESSO!\n");
            ps.print("----------------------------\n\n");
        }
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        // diminui o sysout
        PrintStream ps;
        ps = System.out;

        //declaração de variáveis
        int opt = 99;

        //CLASSES
        Avaliacao[] avaliacoes = new  Avaliacao[10];
        Aluno[] alunos = new Aluno[10];

        while (opt != 0) {
            // atribui a variavel opt o valor retornado pela func mainMenu
            opt = mainMenu(ps,sc,opt);
            // checa qual caso foi escolhido
            switch (opt)
            {
                case 1:
                    //cadastra aluno
                    registraAluno(ps,sc,alunos, avaliacoes);
                    break;
                case 2:
                    //lista alunos
                    listaAluno(alunos, ps);
                    break;
                default:
                    break;
            }
        }


    }
}
