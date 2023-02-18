package BangunDatar;

public class Main {
	public static void main (String[] args) {
		//persegi	
		int sisi; 
		double luaspersegi, kelilingpersegi;
			
		sisi = 4;
			
		luaspersegi = Math.sqrt(sisi);
		kelilingpersegi = 4 * sisi;
			
		System.out.println("Luas Persegi adalah = "+luaspersegi);
		System.out.println("Keliling Persegi adalah = "+kelilingpersegi);
			
		//lingkaran
		int jari_jari; 
		double luaslingkaran, kelilinglingkaran;
		
		jari_jari = 15;
		
		luaslingkaran = Math.PI * Math.sqrt(jari_jari);
		kelilinglingkaran = Math.PI * (2*jari_jari);
		
		System.out.println("Luas Lingkaran adalah = "+luaslingkaran);
		System.out.println("Keliling Lingkaran adalah = "+kelilinglingkaran);
		
		//segitiga
		int sisi_alas, sisi_miring, tinggi; 
		double luassegitiga, kelilingsegitiga;
			
		sisi_alas = 4;
		sisi_miring = 2;
		tinggi = 10;
			
		luassegitiga = 0.5 * sisi_alas * tinggi;
		kelilingsegitiga = sisi_alas + tinggi + sisi_miring;
			
		System.out.println("Luas Segitiga adalah = "+luassegitiga);
		System.out.println("Keliling Segitiga adalah = "+kelilingsegitiga);
		
		//belahketupat
		int diagonal1, diagonal2, sisibelahketupat; 
		double luasbelahketupat, kelilingbelahketupat;
			
		diagonal1 = 3;
		diagonal2 = 2;
		sisibelahketupat = 5;
			
		luasbelahketupat = 0.5 * diagonal1 * diagonal2;
		kelilingbelahketupat = 4 * sisibelahketupat;
		
		System.out.println("Luas Belah Ketupat adalah = "+luasbelahketupat);
		System.out.println("Keliling Belah Ketupat adalah = "+kelilingbelahketupat);
		}
	}


