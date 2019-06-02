package jpa;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Choix {

	private Date date;
	private boolean pause;
	
	public Choix() {
		
	}
	
	public Choix(Date date, boolean pause) {
		this.date = date;
		this.pause = pause;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isPause() {
		return pause;
	}
	public void setPause(boolean pause) {
		this.pause = pause;
	}
}
