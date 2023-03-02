import javax.swing.DefaultListCellRenderer;
import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

// Exercicio2

		int vet[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };

		int exibe = 0;
		int i = 0;
		int num = 0;

		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um num"));

		for (i = 0; i <= 9; i++) {

			if (num == vet[i]) {
				exibe = 1;
			} else {
			}

		}

		if (exibe == 1) {
			System.out.println("O numero " + num + " pertence a sequencia.");
		} else {
			System.out.println("O numero " + num + " não pertence a sequencia.");
		}
	}
}
