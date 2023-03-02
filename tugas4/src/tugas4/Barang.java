package tugas4;

import java.io.Serializable;

public class Barang implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nama;
	private int harga;
	private int persediaan;
	
	Barang(){
	};
	
	Barang(String nama, int harga, int persediaan){
		this.nama = nama;
		this.harga = harga;
		this.persediaan = persediaan;
	}
	
	public String toString() {
		return "Nama Barang : " + nama + "\n Harga : Rp" + harga + "\n Persediaan : " + persediaan + " pcs";
	}

}
