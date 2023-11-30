package tn.enig.dao;
import java.util.*;

import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

public interface IDao {
	   List<Enseignant> getAllEnseignants();
	   void addNewEnseignant(Enseignant ens);
	   List<Matiere> getAllMatieres();
	   void addNewMatiere(Matiere subject);
	   List<Affectation> getAllAffectations();
	   void addNewAffectation(int id_t,int id_s,int charge);
	   void deleteAffectation(int id_a);
}
