package cuentas;
/**
 * Ejercicio de entorno de desarrollo para la practica de refactorizar y crear un documento
 * detallado de la alicación.Metodo main.
 * @author cecilio fresno
 *
 */
public class Main {
/**
 * Metodo main.
 * @param args parametro tipo string.
 */
	public static void main(String[] args){
		
		operativa_cuenta(3000); //Metodo estatico para la ejecución del programa.
    }
/**
 * Metodo estatico que pertenece a la clase.
 * Con este metodo podemos gestionar la cuenta,tanto para ingresar como `para retirar.
 * @param cantidad TODO
 */
	private static void  operativa_cuenta(float cantidad){
	
		CCuenta cuenta1;
	     double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es"+ saldoActual );
	      try {
	            cuenta1.retirar(2300);
	        } catch (Exception e) {
	            System.out.print("Fallo al retirar");
	        }
	        try {
	            System.out.println("Ingreso en cuenta");
	            cuenta1.ingresar(695);
	        } catch (Exception e) {
	            System.out.print("Fallo al ingresar");
	        }
	}
}
