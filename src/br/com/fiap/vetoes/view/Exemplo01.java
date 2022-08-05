package br.com.fiap.vetoes.view;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		
		//Declarar um vetor[] nomes
		String nomes[] = new String[5];
		String a = "";

		//Adicionar os nomes o vetor (usuario digita)
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o nome: ");
		}
		
		//Criar um laço de repetiçãoe exibir os nomes do vetor
		for (String e : nomes) {
			a += e + ", " ;
		}
		JOptionPane.showMessageDialog(null, a);
	}

}
