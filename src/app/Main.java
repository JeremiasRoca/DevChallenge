package app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Password;

public class Main {
static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio5();
		String pas;
		Password pass2=new Password(15);
		Password pass3 = new Password();
		System.out.println("Ingrese una contrase�a");
		pas= scan.next();
		Password pass = new Password(pas);
		
		System.out.println(pass2.getContrase�a());
		if(pass2.esFuerte()) {
			System.out.println("La contrase�a elegida es Segura!");
		}else {
			System.out.println("La contrase�a elegida es Insegura");
		}
		
		System.out.println(pass3.getContrase�a());
		if(pass3.esFuerte()) {
			System.out.println("La contrase�a elegida es Segura!");
		}else {
			System.out.println("La contrase�a elegida es Insegura");
		}
		
		
	}
	
	///Challenge Algoritmos, Ejercicio 1
	public static void ejercicio1() {
		int nro;
		
		System.out.println("Ingrese un numero");
		nro = scan.nextInt();
		if(esPrimo(nro)) {
			System.out.println("El numero es primo");
		}
		else {
			System.out.println("El numero no es primo");
		}
	}

	///Funcion recibe un numero e indica si el mismo es primo o no, retorna un booleano
	public static boolean esPrimo (int nro) {
		boolean flag=true;
		int cont=0;
		
		for(int i=1; i<nro;i++) {
			if(nro%i==0) {
				cont++;
			}
		}
		
		if(cont!=1) {
			flag =false;
		}
		
		return flag;
	}
	
	///Challenge Algoritmos, Ejercicio 2
	public static void ejercicio2()
	{
		String contra,intento;
		int cont=3,i=0;
		boolean flag=false;
		
		System.out.println("Ingrese una contrase�a");
		contra =scan.next();
		
		while(i<cont && flag==false ) {
			System.out.println("Ingrese nuevamente su contrase�a, lleva "+ (i+1) +"  intento/s de 3");
			intento = scan.next();
			if(validaContra(intento,contra)) {
				flag = true;
			}
			i++;
		}
	
		if(flag) {
			System.out.println("Felicitaciones, recuerdas tu contrase�a");
		}else {
			System.out.println("Tenes que ejercitar la memoria");
		}
		
		
		
		
	}
	
///Funcion que recibe el intento del ingreso de contrase�a y la contrase�a, retorna si es la misma o no	
	public static boolean validaContra(String intento,String contra ) {
		boolean flag=false;
		if(intento.equals(contra)) {
			flag=true;
		}
		
		return flag;
	}
	

	///Challenge Algoritmos, Ejercicio 3
		public static void ejercicio3() {
			float valorHora, totalCobrar;
			String nombre;
			int antiguedad,cantHorTrab;
			
			
			System.out.println("Ingrese el valor x hora del empleado");
			valorHora=scan.nextFloat();
			System.out.println("Ingrese el nombre del empleado");
			nombre = scan.next();
			System.out.println("Ingrese su antig�edad del empleado");
			antiguedad= scan.nextInt();
			System.out.println("Ingrese la cantidad de horas trabajadas del mes");
			cantHorTrab = scan.nextInt();
			 totalCobrar = calculaTotalCobrar(valorHora, cantHorTrab, antiguedad);
			 
			 System.out.println("/n/n/n-------------------------------------------");
			 System.out.println("Nombre :"+nombre);
			 System.out.println("Antig�edad :"+ antiguedad);
			 System.out.println("Total a cobrar : $"+ totalCobrar);
			 System.out.println("-------------------------------------------/n/n/n");
		}
		
		///Funcion recibe valor x hora trabajada, horas trabajadas , antiguedad del empleado, retorna total a cobrar
		public static float calculaTotalCobrar(float valxHora,int horasTrab,int antiguedad) {
			float total= valxHora * horasTrab;
			if(antiguedad > 10) {
				total = total + (antiguedad*30);
			}
			
			
			return total;
		}
		
		///Challenge Algoritmos, Ejercicio 4
				public static void ejercicio4() {
					int nroAleatorio, intento,cont=0;
					
					
					System.out.println("Se selecciono un numero entre 0 a 1000, adivine para ganar!\n\n");
					nroAleatorio = generaRandom(0, 1000);
					System.out.println(nroAleatorio);
					
					do {
						System.out.println("\nIngrese un numero :");
						intento = scan.nextInt();
						if(intento!=nroAleatorio) {
							if(nroAleatorio>intento) {
								System.out.println("El numero es mayor");
							}else {
								System.out.println("El numero es menor");
							}
						}
						cont++;
					}while(intento != nroAleatorio);
					
					System.out.println("Felicidades,encontraste el numero!!! Te ha llevado "+ cont+ " intentos en conseguir encontrarlo.");
					
				}
		/// Funcion recibe un minimo y un maximo, con este rango genera un entero random y lo retorna
		public static int generaRandom(int min, int max) {
			int numero;
			Random random = new Random();
			numero = random.nextInt(max+min)+min;
			
			return numero;
		}
		
		///Challenge Algoritmos, Ejercicio 5
		public static void ejercicio5() {
			int nro,mayor, menor, total;
			ArrayList<Integer> array = new ArrayList<Integer>();
			do {
				System.out.println("Ingrese un numero entero, -1 para terminar...");
				nro = scan.nextInt();
				
				if(nro!=-1) {
					array = agregaArray(array, nro);
				}
				
			}while(nro!=-1);
			
			mayor = buscaMayor(array); 
			if(mayor!=-1) {
				System.out.println("\n\n\n\n\nEl mayor numero introducido es : "+ mayor);
			}
			
			menor = buscaMenor(array);
			if(menor!=-1) {
				System.out.println("El menor numero introducido es : "+ menor);
			}
			
			total = sumaNumeros(array);
			System.out.println("La suma de todos los numeros introducidos es : "+ total);
		}
		
		public static ArrayList<Integer> agregaArray(ArrayList<Integer> array, int nro) {
			array.add(nro);
			return array;
		}
		
		
		public static int buscaMayor(ArrayList<Integer> array) {
			int mayor=-1,i=0;
		
			if(!array.isEmpty()) {
				mayor=array.get(i);
				i++;
			if(array.size()>2) {
				while(i<array.size()) {
					if(mayor<array.get(i)) {
						mayor = array.get(i);
					}
					i++;
				}
			}
			}
			
			return mayor;
}
		public static int buscaMenor(ArrayList<Integer> array) {
			int menor = -1, i=0;
			
			if(!array.isEmpty()) {
				menor=array.get(i);
				i++;
			if(array.size()>2) {
				while(i<array.size()) {
					if(menor>array.get(i)) {
						menor = array.get(i);
					}
					i++;
				}
			}
			}
			
			return menor;
		}
		
		public static int sumaNumeros(ArrayList<Integer> array) {
			int suma=0, i=0;
			if(!array.isEmpty()) {
				while(i<array.size()) {
					suma= suma + array.get(i);
					i++;
				}
				
			}
			return suma;
		}
		
}


