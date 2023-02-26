// no es necesario colocar al final de la clase el Exception
// pero se hace como parte de buenas practias

public class SaldoInsuficienteException extends Exception{
	  
	public SaldoInsuficienteException(String mensaje) {
		  super (mensaje);
	  }
}



