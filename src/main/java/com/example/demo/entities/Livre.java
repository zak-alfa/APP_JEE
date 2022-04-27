package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
@Entity
@Table(name="Livres")
public class Livre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String titre;
	
	
	@Column( nullable = false, updatable = false)
	private String maison_edition;
	
	@Column(nullable = false)
	private Boolean disponible;
	
	@Column(nullable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date_sortie;
	
	
	@Column(nullable = false)
	private String auteur;
	
	@Column(nullable = false)
	private int nbr_page;
	
	
	@Column( nullable = false, updatable = false, unique = true)
	private long isbn;
	
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@CreationTimestamp
	private Date date_consultation;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getMaison_edition() {
		return maison_edition;
	}


	public void setMaison_edition(String maison_edition) {
		this.maison_edition = maison_edition;
	}


	public Boolean getDisponible() {
		return disponible;
	}


	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}


	public Date getDate_sortie() {
		return date_sortie;
	}


	public void setDate_sortie(Date date_sortie) {
		this.date_sortie = date_sortie;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public int getNbr_page() {
		return nbr_page;
	}


	public void setNbr_page(int nbr_page) {
		this.nbr_page = nbr_page;
	}


	public long getIsbn() {
		return isbn;
	}


	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}


	public Date getDate_consultation() {
		return date_consultation;
	}


	public void setDate_consultation(Date date_consultation) {
		this.date_consultation = date_consultation;
	}
	
	
	
	

}
