import exe2.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.setNroAluno(1);
        obj1.setNome("João");
        obj1.setIdade(20);
        obj1.setP1(7);
        obj1.setP2(8);
        System.out.println(obj1.notaFinal());
        System.out.println(obj1.exibeDetalhes());
    }
}
