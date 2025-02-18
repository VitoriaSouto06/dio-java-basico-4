public abstract class Conta implements IConta{
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected Cliente cliente;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
       this.saldo -= valor;
    }
   

    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirDadosTitular() {
        System.out.println("==== Dados do titular ====");
        System.out.println("Nome: "+this.cliente.getNome());
        System.out.println("Email: "+this.cliente.getEmail());
        System.out.println("Data de nascimento: "+this.cliente.getDataNascimento());
        System.out.println("Telefone: "+this.cliente.getTelefone());


        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== EXTRATO ====");
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println("Numero: "+ this.numero);
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


   
}
