package dto;

import java.io.Serializable;

public class SlikaGalerija implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idSlikaGalerija;
	private int idGalerija;
	private int idSlika;
	
	public int getIdSlikaGalerija() {
		return idSlikaGalerija;
	}
	public void setIdSlikaGalerija(int idSlikaGalerija) {
		this.idSlikaGalerija = idSlikaGalerija;
	}
	public int getIdGalerija() {
		return idGalerija;
	}
	public void setIdGalerija(int idGalerija) {
		this.idGalerija = idGalerija;
	}
	public int getIdSlika() {
		return idSlika;
	}
	public void setIdSlika(int idSlika) {
		this.idSlika = idSlika;
	}
}
