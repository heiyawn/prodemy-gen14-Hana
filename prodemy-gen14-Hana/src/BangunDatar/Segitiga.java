package BangunDatar;

public class Segitiga {
	private int sisi_alas, sisi_miring, tinggi;
	double luassegitiga, kelilingsegitiga;
	
	//method setter
	
	public void setLuasSegitiga (double luassegitiga) {
		this.luassegitiga = 0.5*sisi_alas*tinggi;
	}
	
	public void setKelilingSegitiga (double kelilingsegitiga) {
		this.kelilingsegitiga = sisi_alas+sisi_miring+tinggi;
	}
	
	//method getter
	
	public double getLuasSegitiga() {
		return luassegitiga;
	}
	
	public double getKelilingSegitiga() {
		return kelilingsegitiga;
	}
	
	
	
	
}


