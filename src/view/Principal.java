/*
 * Exercício de Sistemas Operacionais 1, verificar a existência de números pares
 * e ímpares em um vetor, segundo regras.
 * versão 1.0
 * data 18/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package view;
import controller.OddEvenController;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		OddEvenController controle = new OddEvenController();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor [(máximo 100)(entre 8 nesse exemplo)]: "));
		if (tamanho > 100) {
			JOptionPane.showMessageDialog(null, "Não digitou valor menor que 100, portanto será limitado a 8. ");
			tamanho = 8;
		} else if (tamanho != 8) {
			JOptionPane.showMessageDialog(null, "Seria possível escolher 8? Escolherei por você.");
			tamanho = 8;
		}
		int[] vetor = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " + i + " do vetor: "));
		}
		System.out.println("Resultados para o vetor: ");
		controle.parImpar(vetor);
	}
}
