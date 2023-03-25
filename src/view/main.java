package view;

import br.edu.fateczl.pilhaint.Pilha;

public class main {

	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		for ( int i = 0 ; i < 10 ; i++) {
			if (i % 2 == 0) {
				p.push(i*i);
			} else {
				if (i <= 5) {
					p.push(i);
			} else {
				try {
					p.pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			}
			try {
				int topo = p.top();
				System.out.println("Topo atual--> " + topo);

			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		int tamanho = p.size();
		System.out.println("Tamanho final da Pilha --> "+tamanho);
	}

}
