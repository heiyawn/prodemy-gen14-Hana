package tugas3;

public class soal7 {

	public static void main(String[] args) {
		int uang = 5500;
		String[] daftarBarang = {"Oreo", "Tanggo", "Buavita", "Aqua"};
		int[] harga = {6000, 5000, 7000, 3000};
		
		int hargaMax = 0;
		String barangMax = "";
		
		for (int i = 0; i < daftarBarang.length; i++) {
			if (harga[i] <= uang && harga[i] > hargaMax) {
				hargaMax = harga[i];
				barangMax = daftarBarang[i];
			}
		}
		
		if (barangMax.isEmpty()) {
			System.out.println("Tidak bisa beli apa-apa");
		} else {
			System.out.println("Bisa beli " + barangMax + " dengan harga " + hargaMax);
		}

	}

}
