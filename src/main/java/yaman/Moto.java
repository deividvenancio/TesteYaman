package yaman;

public class Moto {

    public Moto(String cor, Double cilindradas, boolean automatica, int ano, String modelo, String fabricante, Double velocidadeMaxima) {
        this.cor = cor;
        this.cilindradas = cilindradas;
        this.automatica = automatica;
        this.ano = ano;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    private String cor;
    private Double cilindradas;
    private int quantidadeMarchas;
    private boolean automatica;
    private int ano;
    private String modelo;
    private String fabricante;
    private Double velocidade = 0d;
    private Double velocidadeMaxima;

    public Double getVelocidade() {
        return velocidade;
    }

    public void acelerar(double velocidade) {
        this.velocidade += velocidade;
    }

    public int getMarcha() {
        if (velocidade <= 0) {
            return 0;
        } else if (velocidade >= 1 && velocidade < 15) {
            return 1;
        } else if (velocidade >= 15 && velocidade < 40) {
            return 2;
        } else if (velocidade >= 40 && velocidade < 70) {
            return 3;
        } else if (velocidade >= 70 && velocidade < 90) {
            return 4;
        } else if (velocidade >= 90 && velocidade < 110) {
            return 5;
        } else if (velocidade >= 110 && velocidade < 150) {
            return 6;
        }

        return 7;
    }

    public String getCor() {
        return cor;
    }

    public Double getCilindradas() {
        return cilindradas;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
