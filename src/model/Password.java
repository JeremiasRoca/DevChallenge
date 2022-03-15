package model;

public class Password {

	private int longitud;
	private String contraseña;
	
	
	
	
	/**
	 * Constructor generico de contraseña, la contraseña se genera de manera aleatoria, longitud 8
	 */
	public Password() {
		this.longitud=8;
		this.contraseña = generarPassword();
	}
	
	
	/**
	 * @param pass
	 * Constructor de contraseña, recibiendo la contraseña
	 */
	public Password(String pass) {
		
		this.contraseña = pass;
		this.longitud=pass.length();
	}

	/**
	 * @param longitud
	 * @param contraseña
	 *Constructor de contraseña, reciba la longitud y la contraseña se genera de manera aleatoria 
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
/**
 * Verifica si la contraseña es fuerte, para que sea fuerte tiene que tener tener más de 2 mayúsculas, más de 1 minúscula y más de 3 números.
 * 
 * @return true si es fuerte, false si no lo es
 */
	public boolean esFuerte(){
		boolean flag= false;
		int mayus=0,minus=0,num=0;
		for(int i=0; i<contraseña.length();i++) {
			if(Character.isUpperCase(contraseña.charAt(i))) {
				mayus++;
			}else if(Character.isLowerCase(contraseña.charAt(i))) {
				minus++;
			}else if(Character.isDigit(contraseña.charAt(i))) {
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
 
	public static String ESPECIALES = "ñÑ+-*/~_-";
 
	//
	
 //genera contraseña
public String generarPassword() {
		
		return getPassword(longitud);
	}
 
//genera contraseña recibiendo longitud
	public static String getPassword(int length) {
		return getPassword(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
	}
 
	
// genera contraseña recibiendo el string y la longitud
	public static String getPassword(String key, int length) {
		String pswd = "";
 
		for (int i = 0; i < length; i++) {
			pswd+=(key.charAt((int)(Math.random() * key.length())));
		}
 
		return pswd;
	}
	

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	
	
}
