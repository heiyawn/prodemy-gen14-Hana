package tugas2;

public class soal2 {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i==j || i == n - j + 1){
				System.out.print("*");
			} // buat diagonalnya
				else {
			System.out.print(" ");
			}
		}
			System.out.println();
	}
	}

}
