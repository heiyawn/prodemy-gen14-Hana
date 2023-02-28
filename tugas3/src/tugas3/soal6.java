package tugas3;

public class soal6 {

	public static void main(String[] args) {
		String kalimat = "the quick brown fox jumps over the lazy dog";
		
		int jumlahHurufa = 0;
		int jumlahHurufi = 0;
		int jumlahHurufu = 0;
		int jumlahHurufe = 0;
		int jumlahHurufo = 0;
		
		for (int i = 0; i < kalimat.length(); i++) {
			char c = kalimat.charAt(i);
			if(c == 'a') {
				jumlahHurufa++;
			} else if (c == 'i') {
				jumlahHurufi++;
			} else if (c == 'u') {
				jumlahHurufu++;
			} else if (c == 'e') {
				jumlahHurufe++;
			} else if (c == 'o') {
				jumlahHurufo++;
			}
		}
System.out.println("Jumlah huruf vokal : ");
System.out.println("a = " + jumlahHurufa);
System.out.println("i = " + jumlahHurufi);
System.out.println("u = " + jumlahHurufu);
System.out.println("e = " + jumlahHurufe);
System.out.println("o = " + jumlahHurufo);
	}

}
