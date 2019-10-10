package ar.edu.utn.java.collections.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {

//		Integer unEntero = 1; //Integer reemplaza a int en collections//
//		Integer otroEntero = new Integer(2);
//		Integer unTercerEntero = Integer.valueOf("3");
		
//		List<Integer> listaEnteros = new ArrayList(); //hacer import de ArrayList//
		
//		listaEnteros.add(unEntero);
//		listaEnteros.add(unTercerEntero);
		
//		System.out.println(listaEnteros.get(1));
		
//		for (Integer entero : listaEnteros) {
//			System.out.println(entero);
//		}
		
		//Se debe usar Set en vez de HashSet//
//		HashSet<Integer> listaUnica = new HashSet<>();
//		listaUnica.add(123);
//		listaUnica.add(new Integer(123));
//		listaUnica.add(321);
//		listaUnica.add(123123);
		
//		for (Integer elemento : listaUnica) {
//			System.out.println(elemento);
			
//		}
	
		
		//Prograam que pide un numero hasta que se repite y muestra "Ya Esta"//
		
//		Set<Integer> enterosUnicos = new HashSet<>();
//		boolean noEsta = true;
//		Scanner in = new Scanner(System.in);
//		
//		while(noEsta) {
//			System.out.println("Ingrese un valor: ");
//			noEsta = enterosUnicos.add(in.nextInt());
//			}
//		System.out.println("Ya Esta");
		
		
		
		//Queue es la interfaz, LinkedList la clase que permite generar/instanciar objetos//
		
		Stack<Integer> cola = new Stack();
		cola.push(123);
		cola.push(312);
		cola.push(12390);
		
		

		System.out.println(cola.pop());
		System.out.println(cola.pop());
		System.out.println(cola.pop());
			
		
		
	}
	
	
	

}
