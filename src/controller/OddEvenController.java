/*
 * Exercício de Sistemas Operacionais 1, verificar a existência de números pares
 * e ímpares em um vetor, segundo regras.
 * versão 1.0
 * data 18/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package controller;

public class OddEvenController {
	public OddEvenController() {
		super();
	}
	public void parImpar(int[] vetor) {
		for (int numero : vetor) {
			// Verificação se numero é impar
			if (numero % 2 != 0) {
				System.out.println(numero + " é impar.");
			}
			// Verificação se numero é múltiplo de dez (que obviamente é par).
			else if (numero % 10 == 0) {
				System.out.println(numero + " é par e múltiplo de dez.");
			}
		}
	}
}
