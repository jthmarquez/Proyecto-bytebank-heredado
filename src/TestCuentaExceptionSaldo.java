
public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(146, 753);
		cuenta.depositar(210);
		try {
			cuenta.retirar(200);
			cuenta.retirar(20);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}
}
