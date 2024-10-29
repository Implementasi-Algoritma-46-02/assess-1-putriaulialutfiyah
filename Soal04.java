import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner s = new Scanner(System.in);

		String kodePekerjaan = s.nextLine();
		int jamKerja = s.nextInt(); 
		int honor = 30000;
		int hsl;
		double hasil = 1;
		double bonus = 1;
		switch (kodePekerjaan) {
			case "DES":
				hasil = jamKerja * honor + 600000;
				System.out.println(hasil);
				break;
			case "PRG" :
				hasil = jamKerja * honor + 1200000;
				System.out.println(hasil);
				break;
			case "WRT":
				hasil = jamKerja * honor + 400000;
				System.out.println(hasil);
				break;
			case "MKT":
				hasil = jamKerja * honor + 500000;
				System.out.println(hasil);
				break;
			default:
				break;
		}
		
		
	}
}

