package dto;

import java.io.Serializable;

public class Slika implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idSlika;
	private String opis;
	private String fajl;
	
	public int getIdSlika() {
		return idSlika;
	}
	public void setIdSlika(int idSlika) {
		this.idSlika = idSlika;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getFajl() {
		return fajl;
	}
	public void setFajl(String fajl) {
		this.fajl = fajl;
	}
}
