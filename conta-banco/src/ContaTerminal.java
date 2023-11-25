import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
      // TODO: Conhecer e importat a classe Scanner

      Scanner scan = new Scanner(System.in);

      // Exibir as mensagens para o nosso usuário

      // Obter pelo scanner os valores digitados no terminal

      // Exibir a mensagem conta criada

      System.out.println("Por favor, digite o número da Agência !");
      int numeroAgencia = scan.nextInt();

      System.out.println("Por favor, digite os caracteres da Agência !");
      String caracteresAgencia = scan.next();

      System.out.println("Por favor, digite o nome do Cliente !");
      String nomeUsuario = scan.next();

      System.out.println("Por favor, digite o saldo do Cliente !");
      BigDecimal saldoUsuario = scan.nextBigDecimal();

      Usuario usuario = new Usuario(numeroAgencia, caracteresAgencia, nomeUsuario, saldoUsuario);
      
      System.out.println(     
            "Olá " + usuario.getNomeCliente() + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + 
            usuario.getAgencia() + ", conta " + 
            usuario.getNumero() + 
            " e seu saldo " + usuario.getSaldo() + 
            " já está disponível para saque."
        );


    }
}
