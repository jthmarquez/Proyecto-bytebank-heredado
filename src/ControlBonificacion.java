
public class ControlBonificacion {
	
	private double suma;
	
	//todos estos registros de salarios se llaman sobrecarga de metodo
	//para que quede mejor el codigo se pueden borrar los metodos gerente y contador
	//debido a que el parametro funcionario le hereda las clases y sus valores a gerente y contador (polimorfismo) 
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma; 
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	
	public double registrarSalario(Gerente gerente) {
		this.suma = gerente.getBonificacion() + this.suma; 
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	
	public double registrarSalario(Contador contador) {
		this.suma = contador.getBonificacion() + this.suma; 
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
}
