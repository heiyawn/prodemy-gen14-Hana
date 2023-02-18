package BangunDatar;

public class Persegi {
	private int sisi;
	double luaspersegi, kelilingpersegi;
	
	//method setter
	
	public void setLuasPersegi (double luaspersegi) {
		this.luaspersegi = Math.sqrt(sisi);
	}
	
	public void setKelilingPersegi (double kelilingpersegi) {
		this.kelilingpersegi = 4 * sisi;
	}
	
	//method getter
	
	public double getLuasPersegi() {
		return this.luaspersegi;
	}
	
	public double getKelilingPersegi() {
		return this.kelilingpersegi;
	}
}


