package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Participant {
	
	private String nom;
	private String prenom;
	@Id
	private String email;
	private String prefAlimentaire;
	private List<String> allergies;
	private List<Choix> choixSelectionnees = new ArrayList<Choix>();
	
	public Participant() {
		
	}
	
	public Participant(String nom, String prenom, String email) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setEmail(email);
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	@Id
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrefAlimentaire() {
		return prefAlimentaire;
	}

	public void setPrefAlimentaire(String prefAlimentaire) {
		this.prefAlimentaire = prefAlimentaire;
	}

	public List<String> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}

	public List<Choix> getChoixSelectionnees() {
		return choixSelectionnees;
	}

	public void setChoixSelectionnees(List<Choix> choixSelectionnees) {
		this.choixSelectionnees = choixSelectionnees;
	}


}
