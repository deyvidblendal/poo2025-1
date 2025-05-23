package exe1;
public class Cliente {
    private String nroAgencia, nroConta, nome;
    private float saldo;

    public Cliente(String nroAgencia, String nroConta, String nome, float saldo) {
        this.setNroAgencia(nroAgencia);
        this.setNroConta(nroConta);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public Cliente(){

    }
    public void setNroAgencia(String nroAgencia) {
        // métodos de instância
        if (nroAgencia.length() == 6) {
            if (nroAgencia.charAt(4) == '-') {
                this.nroAgencia = nroAgencia;
            } else System.out.println("Problema no DV");
        }
        else System.out.println("Problema no tamanho");
    }
    public void setNroConta(String nroConta) {
        if (nroConta.length() == 8){
            if (nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else System.out.println("Problema no DV");
        }
        else System.out.println("Problema no tamanho");
    }
    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Problema no tamanho");
    }
    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo não pode ser negativo");
    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public String getNroConta() {
        return nroConta;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public String exibirCliente() {
        return "Cliente{" +
                "nroAgencia='" + nroAgencia + '\'' +
                ", nroConta='" + nroConta + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}