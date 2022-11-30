package br.edu.fatecrl.mvcdemo.models;

public class Top10 {

    private String titulo;
    private String posicaoRank;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPosicaoRank() {
        return posicaoRank;
    }

    public void setPosicaoRank(String posicaoRank) {
        this.posicaoRank = posicaoRank;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public Top10(String titulo, String posicaoRank, double nota1, double nota2, double nota3) {
        this.titulo = titulo;
        this.posicaoRank = posicaoRank;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
}
