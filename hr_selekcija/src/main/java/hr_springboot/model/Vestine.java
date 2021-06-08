package hr_springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vestine")
public class Vestine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVes;
	
	
	@Column(name="name_ves")
	private String nameV;
	
	public Vestine() {
		
	}
	
	public Vestine(int idVes, String nameV) {
		super();
		this.idVes = idVes;
		this.nameV = nameV;
	}

	public int getIdVes() {
		return idVes;
	}

	public void setIdVes(int idVes) {
		this.idVes = idVes;
	}

	public String getNameV() {
		return nameV;
	}

	public void setNameV(String nameV) {
		this.nameV = nameV;
	}

	

	
	

}
