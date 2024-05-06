package View;

import Model.Conta;

public class Main {
  public static void main(String[] args) {
    Conta conta = new Conta();
    conta.setAgencia(1234);
    conta.setCodigo(123456);
    conta.setSaldo(1000);
    conta.setLimite(500);
    try {
      conta.sacar(1500);
      System.out.println("Saque efetuado com sucesso!");
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }
}
