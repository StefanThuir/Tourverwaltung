package de.thuir.privat.Tourverwaltung;

import javax.persistence.*;

@Entity
@Table(name = "tbl_Ziel")
public class Ziel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ziel;
	private long entfernung;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getZiel() {
		return ziel;
	}
	public void setZiel(String ziel) {
		this.ziel = ziel;
	}
	public long getEntfernung() {
		return entfernung;
	}
	public void setEntfernung(long entfernung) {
		this.entfernung = entfernung;
	}
	
	
	public String toString() {
		return "Ziel{" +
                "ID=" + id +
                ", Ziel='" + ziel + '\'' +
                ", Entfernung=" + entfernung +
                '}'; 
	}
	
	
}
