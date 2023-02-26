 //entidad Cuenta:
public abstract class Cuenta {
	
      protected double saldo; 
      private int agencia = 1;
      private int numero;
      private Cliente titular = new Cliente();
     
      private static int total = 0;
      
      public Cuenta(int agencia, int numero) {
    	  this.agencia = agencia;
    	  this.numero = numero;
    	  System.out.println("Estoy creando una cuenta " + this.numero);
    	  Cuenta.total ++;
    	  if (agencia <= 0) {
    		  System.out.println("No se permite 0");
    		  this.agencia = 1;
    	  } else {
    		  this.agencia = agencia;
    	  }
    	  total++;
    	  System.out.println("Se van creando: " + total + " cuentas");
      }
      
     //no retorna valor 
     public abstract void depositar(double valor);
      
     //retorna valor 
     public void retirar(double valor) throws SaldoInsuficienteException {
    	 if (this.saldo < valor) {
    		 throw new SaldoInsuficienteException("No tienes saldo");
    	 }
    		 this.saldo -= valor;
     } 
     
    public boolean transferir (double valor, 
    		                   Cuenta cuenta) {
    	if (this.saldo >= valor) {
    		try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		cuenta.depositar(valor);
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public double getSaldo() {
    	return this.saldo;
    } 
    
    public int getAgencia() {
    	return agencia;
    } 
    
    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }
    
   public void setTitular(Cliente titular) {
	   this.titular = titular;
   }
   
   public Cliente getTitular() {
	   return titular;
   }
   
   public static int getTotal() {
	   return Cuenta.total;
   }
}

   