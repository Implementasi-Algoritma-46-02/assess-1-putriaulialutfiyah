import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner s = new Scanner(System.in);

		int H = s.nextInt();
		int M = s.nextInt();
		int V = s.nextInt();

		int jumlah = M + V;
		int jml = jumlah % 60;
		int jam = jumlah /60;

		System.out.print( H + jam + ":" + jml);
	}
}
