package model;

public class Password {

	private int longitud;
	private String contrase�a;
	
	
	
	
	/**
	 * Constructor generico de contrase�a, la contrase�a se genera de manera aleatoria, longitud 8
	 */
	public Password() {
		this.longitud=8;
		this.contrase�a = generarPassword();
	}
	
	
	/**
	 * @param pass
	 * Constructor de contrase�a, recibiendo la contrase�a
	 */
	public Password(String pass) {
		
		this.contrase�a = pass;
		this.longitud=pass.length();
	}

	/**
	 * @param longitud
	 * @param contrase�a
	 *Constructor de contrase�a, reciba la longitud y la contrase�a se genera de manera aleatoria 
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarPassword();
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
/**
 * Verifica si la contrase�a es fuerte, para que sea fuerte tiene que tener tener m�s de 2 may�sculas, m�s de 1 min�scula y m�s de 3 n�meros.
 * 
 * @return true si es fuerte, false si no lo es
 */
	public boolean esFuerte(){
		boolean flag= false;
		int mayus=0,minus=0,num=0;
		for(int i=0; i<contrase�a.length();i++) {
			if(Character.isUpperCase(contrase�a.charAt(i))) {
				mayus++;
			}else if(Character.isLowerCase(contrase�a.charAt(i))) {
				minus++;
			}else if(Character.isDigit(contrase�a.charAt(i))) {
				num++;
			}
		}
		if(mayus>2 && minus>1 && num>3) {
			flag=true;
		}
		
		return flag;
	}
	
	
	
	
	
	public static String NUMEROS = "0123456789";
	 
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
	public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
 
	public static String ESPECIALES = "��+-*/~_-";
 
	//
	
 //genera contrase�a
public String generarPassword() {
		
		return getPassword(longitud);
	}
 
//genera contrase�a recibiendo longitud
	public static String getPassword(int length) {
		return getPassword(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
	}
 
	
// genera contrase�a recibiendo el string y la longitud
	public static String getPassword(String key, int length) {
		String pswd = "";
 
		for (int i = 0; i < length; i++) {
			pswd+=(key.charAt((int)(Math.random() * key.length())));
		}
 
		return pswd;
	}
	

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}
	
	
	
}
