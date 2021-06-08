package hr_springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vestine_kandidata")
public class KandidatVestine implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idvk;
	
	@Column(name="id_can")
	private int idCan;
	
	@Column(name="id_ves")
	private int idVes;
	
	
	
	public KandidatVestine() {
		
	}
	
	public KandidatVestine(int idCan, int idVes, int idvk) {
		super();
		this.idCan = idCan;
		this.idVes = idVes;
		this.idvk=idvk;
	}

	public int getIdvk() {
		return idvk;
	}

	public void setIdvk(int idvk) {
		this.idvk = idvk;
	}

	public int getIdCan() {
		return idCan;
	}

	public void setIdCan(int idCan) {
		this.idCan = idCan;
	}

	public int getIdVes() {
		return idVes;
	}

	public void setIdVes(int idVes) {
		this.idVes = idVes;
	}

	

	

}
