package exe0;

public class Carro {
    //variáveis encapsuladas
    private String marca, modelo;
    private int ano;
    private float velocidade;

    public Carro() {
        this.marca = "Sem Marca";
        this.modelo = "Sem Modelo";
    }
    public Carro(String marca, String modelo, int ano, float velocidade) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    // interfaces públicas
    // alterar valor da variável, usa-se os setter
    public void setMarca (String marca) {
        this.marca = marca;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        if (ano >= 0 ) {
            this.ano = ano;
        }
        else {
            System.out.println("Ano não pode ser negativo");
        }
    }
    public void setVelocidade (float velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        }
        else {
            System.out.println("Velocidade não pode ser negativo");
        }
    }
    // acessar valor da variável, usa-se os getters
    public String getModelo() {
        return this.modelo;
    }
    public String getMarca() {
        return this.marca;
    }
    public int getAno() {
        return this.ano;
    }
    public float getVelocidade() {
        return this.velocidade;
    }

}
