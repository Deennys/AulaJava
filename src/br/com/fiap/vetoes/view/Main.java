package br.com.fiap.vetoes.view;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos produtos deseja cadastrar:"));
		Produto prod[] = new Produto[p];
		double vlrTotal = 0;
		
		for(int i = 0; i < p; i++) {
			int qtd = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade:"));
			double preco  = Double.parseDouble(JOptionPane.showInputDialog("digite o preço:"));
			double desconto = Double.parseDouble(JOptionPane.showInputDialog("digite a desconto:"));
			prod[i] = new Produto(qtd, preco, desconto);;
		}
		
		for(Produto e : prod) {
			vlrTotal += Produto.valorTotal(e.getQtd(), e.getPreco(), e.getDesconto());
		}
		
		JOptionPane.showMessageDialog(null, "Valor total: " + vlrTotal);
		
	}

}
