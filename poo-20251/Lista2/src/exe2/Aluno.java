package exe2;

public class Aluno {
    private int nroAluno, idade;
    private String nome;
    private float p1, p2;

    public Aluno() {
        this.nome = "sem nome";
    }

    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.setNroAluno(nroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }

    public int getNroAluno() {
        return nroAluno;
    }

    public void setNroAluno(int nroAluno) {
        //método de classe
        String aux = String.valueOf(nroAluno);
        if (aux.length() == 6) {
            this.nroAluno = nroAluno;
        }
        else System.out.println("Problema de tamanho");
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        }
        else System.out.println("Idade não pode ser negativa");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Problema no tamanho");
    }
    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if(p1 >= 0) {
            this.p1 = p1;
        }
        else System.out.println("P1 não pode ser negativo");
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 >= 0) {
            this.p2 = p2;
        }
        else System.out.println("P2 não pode ser negativo");
    }
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public String exibeDetalhes(){
        return "Aluno: " + this.nome + '\n' +
                "Nro: " + this.nroAluno + '\n' +
                "Idade: " + this.idade;
    }
}
