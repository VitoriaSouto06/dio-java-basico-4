import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = 
        new Cliente("Ana Maria","anamaria@gmail.com",LocalDate.now(),"1278564723");
      

        Cliente cliente2 =
         new Cliente("Juliana","juliana@gmail.com",LocalDate.now(),"12344555666");
        



        Conta c1 = new ContaCorrente(cliente1);
        Conta c2 = new ContaPoupanca(cliente2);

       c1.imprimirExtrato();
       c1.imprimirDadosTitular();
        
    }           
}
