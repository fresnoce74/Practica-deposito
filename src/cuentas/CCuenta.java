


package cuentas;
/**
 * Ejercicio de entorno de desarrollo para la practica de refactorizar y crear un documento
 * detallado de la alicación.Esta clase es la que interactua con el metodo operativa_cuenta().                                                           
 * @author cecilio fFresno.   
 */


public class CCuenta {
	

/**
 * Atirbutos de la clase.Aquí se puede ver la encapsulación. 
 */
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    
    /**
     * Constructor vacio sin parametro.Para inicializar sin ningún parametro.
     */
   
    public CCuenta()
    {

   

    }

  
    /**
     * Constructor con 4 parametros para su inicialización.
     * @param nom nombre tipo string.
     * @param cue cuenta tipo string
     * @param sal saldo tipo double.
     * @param tipo tipo tipo double.
     */
  
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

/**
 *  Metodo que  devuelve el nombre que nos han dado.
 * Aquí se puede ver la encapsulación.  
 * @return tipo string.
 */



 
    public String getNombre() {
		return nombre;
	}

/**
 * Metodo que nos pide un parametro(nombre),pero no devuelve nada.
 * Aquí se puede ver la encapsulación. 
 * @param nombre tipo string
 */
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

/**
 *Metodo que  devuelve el parametro cuenta que nos han dado.
 *Aquí se puede ver la encapsulación.  
 * @return tipo string.
 */

    public String getCuenta() {
		return cuenta;
	}

/**
 * Metodo que nos pide un parametro(cuenta),pero no devuelve nada.
 * Aquí se puede ver la encapsulación. 
 * @param cuenta nos pide un tipo string.
 */
    
    public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	
/**
 * Metodo que nos devulve el saldo de tipo double.
 * Aquí se puede ver la encapsulación.  
 * @return nos devulve un double.
 */
  
  
  
    public double getSaldo() {
		return saldo;
	}

	
    /**
     * Metodo que nos pide el saldo de la cuenta.
     * Aquí se puede ver la encapsulación. 
     * @param saldo nos pide un double.
     */
    public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

/**
 * Metodo que nos retorna el tipo de interés que tiene la cuenta.
 * Aquí se puede ver la encapsulación. 	
 * @return nos pide un double.
 */
    
    public double getTipoInteres() {
		return tipoInteres;
	}

	
/**
 * Metodo que nos pide el tipo de interés.
 * @param tipoInteres nos pide un double.
 */
    public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

/**
 * 
 * Metodo que nos retorna el saldo de la cuenta.
 * Aquí se puede ver la encapsulación. 
 * @return nos devuelve un double.
 */
    
    public double estado()
    {
        return saldo;
    }

/**
 * Metodo que nos pide una cantidad de dinero para ingrasar a la cuenta.
 * Tiene una excepcion de tipo Exception,la cual si el saldo es menor de nos manda un mensaje (No se puede ingresar una cantidad negativa).
 * @param cantidad  nos pide un double.
 * @throws Exception nos da una excepcion.
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)//Si cantidad es menor que 0. 
            throw new Exception("No se puede ingresar una cantidad negativa");//EXCEPCIÓN. 
        saldo = saldo + cantidad;
    }

  /**
   * Metodo que nos pide una cantidad de dinero para retirar de la cuenta.
   * Tiene una excepcion de tipo Exception,la cual si la cantidad es menor e igual a 0 nos manda un mensaje (No se puede retirar una cantidad negativa). 
   * Si  no se cumple la primeracondición pasara a la sengunda y nos mandara otro mensaje (No se hay suficiente saldo).
   * @param cantidad nos pide un double
   * @throws Exception nos da una excepcion.
   */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)//Si cantidad es menor e igual que 0.
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)//Si el metodo estado es menor que cantidad.
            throw new Exception ("No se hay suficiente saldo");//EXCEPCIÓN.
        saldo = saldo - cantidad;
    }
}

