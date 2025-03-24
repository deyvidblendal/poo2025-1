import exe1.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        obj1.setNroConta("123456-7");
        obj1.setNroAgencia("1234-5");
        obj1.setNome("João");
        obj1.setSaldo(20);
        System.out.println(obj1.exibirCliente());
    }
}