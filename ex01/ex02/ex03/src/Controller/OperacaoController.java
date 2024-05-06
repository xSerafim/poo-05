package Controller;

public class OperacaoController {
  public double operacaoValor(int valor) throws ArithmeticException {
    if (valor < 0) {
      throw new ArithmeticException("Valor negativo");
    }

    if (valor % 2 == 0) {
      return Math.pow(valor, 2);
    } else {
      return Math.pow(valor, 3);
    }
  }
}