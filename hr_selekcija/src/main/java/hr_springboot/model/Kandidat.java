package hr_springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kandidat")
public class Kandidat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCan;
	
	@Column(name="name")
	private String name;
	
	@Column(name="date_b")
	private Date dateB;
	
	@Column(name="contact_num")
	private int contactN;
	
	@Column(name="mail")
	private String mail;
	
	public Kandidat() {
		
	}
	
	public Kandidat(int idCan, String name, Date dateB, int contactN, String mail) {
		super();
		this.idCan = idCan;
		this.name = name;
		this.dateB = dateB;
		this.contactN = contactN;
		this.mail = mail;
	}
	public int getIdCan() {
		return idCan;
	}
	public void setIdCan(int idCan) {
		this.idCan = idCan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateB() {
		return dateB;
	}
	public void setDateB(Date dateB) {
		this.dateB = dateB;
	}
	public int getContactN() {
		return contactN;
	}
	public void setContactN(int contactN) {
		this.contactN = contactN;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
