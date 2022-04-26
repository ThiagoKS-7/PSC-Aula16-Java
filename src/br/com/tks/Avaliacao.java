package br.com.tks;

public class Avaliacao {
    private final String materia;
    private final float A1;
    private final float A2;
    private final float A3;



    public Avaliacao(String materia, float A1,float A2,float A3) {
        this.materia = materia;
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;

    }
    public float getA1() {
        return this.A1;
    }
    public float getA2() {
        return this.A2;
    }

    public float getA3() {
        return this.A3;
    }


    public String getMateria() {
        return  this.materia;
    }

}
