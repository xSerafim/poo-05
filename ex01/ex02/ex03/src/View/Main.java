package View;

import javax.swing.JOptionPane;

import Controller.OperacaoController;

public class Main {
  public static void main(String[] args) {
    OperacaoController operacao = new OperacaoController();

    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));

    try {
      double resultado = operacao.operacaoValor(valor);
      JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    } catch (ArithmeticException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
  }
}
