
public class TestControlBonificacion {
	
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente Jimena =new Gerente();
		Jimena.setSalario(10000);
		
		Contador alexiz = new Contador();
				alexiz.setSalario(5000);
		
		ControlBonificacion controlBonificacion = 
				new ControlBonificacion();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(Jimena);
		controlBonificacion.registrarSalario(alexiz);
	}
}
