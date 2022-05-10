package sn.simplon.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.simplon.entities.Categorie;

public class CategorieImpl  implements ICategorie{
	private EntityManager em;
	public CategorieImpl() {
		
	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("AtelierJpa1");
	em = emf.createEntityManager();
	}

	@Override
	public int add(Categorie categorie) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.persist(categorie);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.remove(em.find(Categorie.class, id));
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int update(Categorie categorie) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Categorie> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
