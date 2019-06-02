package jpa;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sondage {
	
	private Long id;
	private String intitule;
	private String resume;
	private Participant createur;
	private boolean pause;
	private List<Choix> choix = new ArrayList<Choix>();
	private List<Participant> participants = new ArrayList<Participant>();
	
	public Sondage() {
		super();
	}
	
	public Sondage(String intit, String res, Participant creat, boolean pause) {
		this.setIntitule(intit);
		this.setResume(res);
		this.setCreateur(creat);
		this.participants.add(createur);
		this.setPause(pause);
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	
	@OneToMany(mappedBy = "sondage")
	public List<Participant> getParticipants() {
		return participants;
	}
	
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public Participant getCreateur() {
		return createur;
	}

	public void setCreateur(Participant createur) {
		this.createur = createur;
	}

	public boolean isPause() {
		return pause;
	}

	public void setPause(boolean pause) {
		this.pause = pause;
	}

	public List<Choix> getChoix() {
		return choix;
	}

	public void setChoix(List<Choix> choix) {
		this.choix = choix;
	}

}
