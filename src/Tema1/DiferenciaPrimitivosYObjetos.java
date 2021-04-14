package Tema1;

import java.security.PublicKey;
import java.util.Date;

public class DiferenciaPrimitivosYObjetos {
	
	public static void main(String[] a) {
		difsEntreValorYReferencia();
		pasoParsRef();
	}
	
	public static void pasoParsRef(){
		Date fecha;
		fecha = new Date();
		System.out.println(fecha);
		cambiaFecha(fecha);
	}
		
	/**
	 * @param f
	 */
	public static void cambiaFecha (Date f) {
		f.setTime(f.getTime() + 1000*60*60*24);
		System.out.println(f);
		}

	
	/**
	 * @
	 */
	public static void  difsEntreValorYReferencia() {
		int i;
		i = 5;
		int j = i ;
		cambiarI( i );
		System.out.println(i);
		//referencias
		String string1;
		string1= new String("hola");
		String string2="ho";
		string2 += "la";
		if (string1==string2) {
			System.out.println("son iguales");
		}else{ System.out.println( "No son iguales");}
	}		
	public static void cambiarI(int dato) {
		dato=dato+10;
		System.out.println( dato );
			
	}
}