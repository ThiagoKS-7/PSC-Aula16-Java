package br.com.tks;

import java.io.PrintStream;

public class Aluno {
    private final String nome; // se surgir a necessidade de mudar o nome, tira o final
    private final int matricula;
    private final float A1;
    private final float A2;
    private final float A3;

    // método construtor da classe
    public  Aluno(String nome, int matricula,float A1,float A2,float A3) {
        //ATRIBUTO DA CLASSE SE USA COM THIS
        this.nome = nome;
        this.matricula = matricula;
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
    }
    //**********************
    /*      MÉTODOS       */
    //**********************
    public float calculaMedia() {
        //colocar F no fim garante que o valor é float
        return  ( this.A1 * 0.2F) + (this.A2 * 0.3F) + ( this.A3 * 0.5F);
    }
    //****************************
    /*      GETTERS PRIVADOS    */
    // ***************************
    public String getNome() {
        return this.nome;
    }
    public int getMatricula() {
        return this.matricula;
    }
    private String getDados() {
        return String.format("Nome: %s\nMatricula: %d\n",this.getNome(), this.getMatricula());
    }
    private String getNotas() {
        return String.format("A1:%.2f\nA2:%.2f\nA3:%.2f\n", this.A1, this.A2, this.A3);
    }
    private String getMedia() {
        return String.format("Média: %.2f", this.calculaMedia());
    }
    //****************************
    /*      GETTERS PÚBLICOS    */
    // ***************************

    public String getAluno() {
        return this.getDados() + this.getNotas() + this.getMedia();
    }
    //TODO: FAZER UM SWITCH Q PERGUNTE QUAL AVALIAÇÃO Q É
}
