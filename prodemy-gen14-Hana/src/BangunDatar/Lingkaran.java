package BangunDatar;

public class Lingkaran {
	private int jari_jari;
	double luaslingkaran, kelilinglingkaran;
	
	//method setter
	
	public void setLuasLingkaran (double luaslingkaran) {
		this.luaslingkaran = Math.PI * Math.sqrt(jari_jari);
	}
	
	public void setKelilingLingkaran (double kelilinglingkaran) {
		this.kelilinglingkaran = Math.PI * (2*jari_jari);
	}
	
	//method getter
	
	public double getLuasLingkaran() {
		return luaslingkaran;
	}
	
	public double getKelilingLingkaran() {
		return kelilinglingkaran;
	}
	
}


