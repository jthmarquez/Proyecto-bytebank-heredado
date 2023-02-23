                  //extiende de
public class Gerente extends Funcionario implements Autenticable {
	
	//sobre-escritura de metodo 
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		return 200;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
