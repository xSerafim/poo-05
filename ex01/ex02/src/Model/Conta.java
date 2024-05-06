package Model;

public class Conta {
  private int agencia;
  private int codigo;
  private float saldo;
  private float limite;

  public Conta() {
    super();
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public float getLimite() {
    return limite;
  }

  public void setLimite(float limite) {
    this.limite = limite;
  }

  public void sacar(float valor) throws IllegalArgumentException {
    if (valor <= this.saldo + this.limite) {
      this.saldo -= valor;
    } else {
      throw new IllegalArgumentException("Saldo insuficiente! Valor solicitado: " + valor + " Saldo disponível: "
          + this.saldo + " Limite Disponível: " + this.limite);
    }
  }
}