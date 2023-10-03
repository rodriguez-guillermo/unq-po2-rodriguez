package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numeros;
	
	//TODO Si no lo creo, el test falla. Xq? Es el constructor?
	public Counter() {
		numeros = new ArrayList<Integer>();
	}
	
	//Agrega el numero a la lista 'numeros'
	public void addNumber(Integer i) {
		
		numeros.add(i);
	}
	
	//Devuelve la cantidad de numeros pares de la lista 'numeros'
	public Integer getEvenOcurrences() {
		
		Integer cantidadNumerosPares = (int) numeros.stream().filter(numeroAEvaluar -> esNumeroPar(numeroAEvaluar)).count();
		return cantidadNumerosPares;
	}

	private boolean esNumeroPar(Integer numeroAEvaluar) {
		return numeroAEvaluar % 2 == 0;
	}
	
	//Devuelve la cantidad de numeros impares de la lista 'numeros'
	public Integer getOddOcurrences() {
		
		Integer cantidadNumerosImpares = (int) numeros.stream().filter(numeroAEvaluar ->  !esNumeroPar(numeroAEvaluar)).count();
		return cantidadNumerosImpares;
	}

	public Integer getMultiplyOcurrences(Integer multiploAEvaluar) {
		
		Integer cantidadDeMultiplos = (int) numeros.stream().filter(numeroAEvaluar ->  esMultiploDe(numeroAEvaluar, multiploAEvaluar)).count();
		return cantidadDeMultiplos;
	}

	public boolean esMultiploDe(Integer numeroAEvaluar, Integer multiploAEvaluar) {

		return (numeroAEvaluar % multiploAEvaluar) == 0;
	}	
}
