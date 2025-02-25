package exe0;
import javax.swing.*;

public class Carro {
    // variáveis são fortemente tipadas
    // int é um tipo primitivo de dados
    public int ano;
    public float velocidade;
    // String: é um tipo de dado do tipo classe
    public String marca, modelo;

    // Métodos construtores
    public Carro(){
        this.marca = "indefinido";
        this.modelo = "indefinido";
    }
    public Carro(String marca, String modelo, int ano, int velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    // MÉTODOS
    public void exibeDtalhes(){
        // this representa o objeto que chama o método
        System.out.println("Carro " +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nAno: " + this.ano +
                "\nVelocidade: "+ this.velocidade +
                "\n ##################### ");
    }
    public void exibeDtalhes2(){
        // this representa o objeto que chama o método
        JOptionPane.showMessageDialog(null,
                "\nCarro " +
                        "\nMarca: " + this.marca +
                        "\nModelo: " + this.modelo +
                        "\nAno: " + this.ano +
                        "\nVelocidade: "+ this.velocidade);
    }
    // acelerar o carro
    // x representa o quanto vai acelerar
    public void acelerar(float x ){
        this.velocidade += x;
    }

    //frear o carro
    public void frear(float x){
        if (this.velocidade >= x){
            this.velocidade -= x;
        }
        else{
            System.out.println("Impossível frear");
        }
    }

}
