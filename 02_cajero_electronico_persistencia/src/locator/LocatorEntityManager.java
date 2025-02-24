package locator;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LocatorEntityManager {
	private static EntityManager em;
	public static EntityManager getEntityManager() {
		if(em==null) {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("bancaPU");
			em=factory.createEntityManager();
		}
		return em;
		
	}
}
