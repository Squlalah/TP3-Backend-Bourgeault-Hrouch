package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {
	
	private EntityManager manager;
	
	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = EntityManagerHelper.getEntityManager();
		JpaTest test = new JpaTest(manager);
		
		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		try {
			test.createParticipants();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		
		test.listParticipants();
		
		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//factory.close();
	}
	
	private void createParticipants() {
		manager.persist(new Participant("Jean", "Michel", "jean.michel@mail.fr"));
		manager.persist(new Participant("Hugo", "Victor", "hugo.victor@mail.fr"));
		manager.persist(new Participant("Bourgeault", "Clément", "bourgeault.clement@mail.fr"));
	}
	
	private void listParticipants() {
		List<Participant> resultList = manager.createQuery("Select a From Participant a", Participant.class).getResultList();
		System.out.println("nombre de participants : " + resultList.size());
		for(Participant p : resultList) {
			System.out.println("prochain participant : " + p);
		}
	}


}
