package sn.simplon.dao;
import java.util.List;

import sn.simplon.entities.Categorie;
public interface ICategorie {
	    public int add(Categorie categorie);
	    public int delete(int id);
	    public int update(Categorie categorie);
	    public List<Categorie> getAll();
	    public Categorie getId(int id);


	}

