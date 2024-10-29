import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner s = new Scanner(System.in);

		int idPertama = s.nextInt();
		int idKedua = s.nextInt();
		int idKetiga = s.nextInt();
		int idKeempat = s.nextInt();
		int idKelima = s.nextInt();

		if (idPertama < idKedua) {
			System.out.println(idPertama + " valid");
		} else {
			System.out.println(idPertama + " tidak valid");
		}

		if (idKedua < idKetiga) {
			System.out.println(idKedua + " valid");
		} else {
			System.out.println(idKedua + " tidak valid");
		}

		if (idKetiga > idKedua) {
			System.out.println(idKetiga + " valid");
		} else {
			System.out.println(idKetiga + " tidak valid");
		}

		if (idKeempat > idKetiga) {
			System.out.println(idKeempat + " valid");
		} else {
			System.out.println(idKeempat + " tidak valid");
		}

		if (idKelima > idKeempat) {
			System.out.println(idKelima + " valid");
		} else {
			System.out.println(idKelima + " tidak valid");
		}
	}
}
