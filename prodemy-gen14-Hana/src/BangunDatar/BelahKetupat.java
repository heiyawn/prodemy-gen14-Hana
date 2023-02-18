package BangunDatar;

public class BelahKetupat {
	private int diagonal1, diagonal2, sisibelahketupat;
	double luasbelahketupat, kelilingbelahketupat;
	
	//method setter
	
	public void setLuasBelahKetupat (double luasbelahketupat) {
		this.luasbelahketupat = 0.5 * diagonal1 * diagonal2;
	}
	
	public void setKelilingBelahKetupat (double kelilingbelahketupat) {
		this.kelilingbelahketupat = 4 * sisibelahketupat;
	}
	
	//method getter
	
	public double getLuasBelahKetupat() {
		return luasbelahketupat;
	}
	
	public double getKelilingBelahKetupat() {
		return kelilingbelahketupat;
	}
}


