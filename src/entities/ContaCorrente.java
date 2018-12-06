package entities;

public class ContaCorrente {

	private int numero;
	private String titular;
	private double saldo;

	
	public ContaCorrente(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public ContaCorrente(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo = saldo - valor - 5.00;
	}
	
	public String toString(){
		return
				"Account "
				+getNumero()
				+", Holder: "
				+getTitular()
				+", Balance: $ "
				+ String.format("%.2f", getSaldo());
	}
	
}
