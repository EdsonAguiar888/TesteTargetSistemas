
public class Exercicio5 {

	public static void main(String[] args) {

		int i;

		String vet[] = { " E ", " S ", " T ", " U ", " D ", " A ", " N ", " T ", " E " };

		System.out.println(" Crescente ");
		for (i = 0; i <= 8; i++) {
			System.out.println(vet[i]);
		}

		System.out.println("");

		System.out.println(" Decrescente ");
		for (i = 8; i >= 0; i--) {
			System.out.println(vet[i]);
		}
	}
}
