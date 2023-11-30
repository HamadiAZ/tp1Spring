package tn.enig.dao;


import java.util.*;
//import java.sql.ResultSet;
//import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.*;
import tn.enig.model.*;

public class Dao implements IDao {
	Connection cnx = null;

	public Dao()  {

		try {
			// Load the JDBC driver class
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Replace the connection string, username, and password with your own values
			String connectionUrl = "jdbc:sqlserver://HAMMADI-DELLG15\\SQLEXPRESS;databaseName=tp1;user=phenix;password=phenix;";

			// Establish the database connection
			cnx = DriverManager.getConnection(connectionUrl);

			if (cnx != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to connect to the database.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	public List<Matiere> getAllMatieres() {
//		List<Matiere> liste;
//		try {
//			liste = new ArrayList<Matiere>();
//			PreparedStatement pr = cnx.prepareStatement("select * from matiere");
//			ResultSet rs = pr.executeQuery();
//			while (rs.next()) {
//				Matiere dept = new Matiere(rs.getInt("id"), rs.getString("titre"), rs.getInt("nbh"),
//						rs.getInt("niveau"));
//				liste.add(dept);
//			}
//		} catch (Exception e) {
//			return null;
//		}
//		return liste;
//	}
	static List<Enseignant> enss = new ArrayList<>();
	   static List<Matiere> mats = new ArrayList<>();
	   static List<Affectation> affectations = new ArrayList<>();
	   static {
	      Enseignant ens1 = new Enseignant("hammadi","azaiez",300);
	      Enseignant ens2 = new Enseignant("ali","bensalah",400);
	      Enseignant ens3 = new Enseignant("mohamed","ali",500);
	      enss.add(ens1) ;
	      enss.add(ens2) ;
	      enss.add(ens3);
	      Matiere mat1 = new Matiere("englais",20,1);
	      Matiere mat2 = new Matiere("francais",30,3);
	      Matiere mat3 = new Matiere("math",10,2);
	      Matiere mat4 = new Matiere("test",10,2);
	      mats.add(mat1);
	      mats.add(mat2);
	      mats.add(mat3);
	      mats.add(mat4);
	      Affectation affectation1 = new Affectation(ens1,mat1,60);
	      Affectation affectation2 = new Affectation(ens2,mat2,30);
	      Affectation affectation3 = new Affectation(ens3,mat3,20);
	      affectations.add(affectation1);
	      affectations.add(affectation2);
	      affectations.add(affectation3);
	   }
	    
	    @Override
	    public List<Enseignant> getAllEnseignants() {
	       return enss;
	   }
	    @Override
	    public void addNewEnseignant(Enseignant ens) { enss.add(ens); }
	    @Override
	    public List<Matiere> getAllMatieres() {
	        return mats;
	    }
	    @Override
	    public void addNewMatiere(Matiere mat) {
	        mats.add(mat);
	    }
	    @Override
	    public List<Affectation> getAllAffectations() {
	        return affectations;
	    }
	    @Override
	    public void addNewAffectation(int id_ens, int id_mat,int charge) {
	       Enseignant ens = null;
	       Matiere mat = null;
	       
	       for(Enseignant t : enss){
	           if(t.getId() == id_ens){
	               ens = t;
	           }
	       }
	       for(Matiere s : mats){
	          if(s.getId() == id_mat){
	              mat = s;
	          }
	      }
	       if(ens == null || mat == null){
	           System.out.println("You should check your inputs");
	           return;
	       }
	       Affectation affectation = new Affectation(ens,mat,charge);
	       System.out.println("Add new affectation "+affectation);
	       affectations.add(affectation);
	    }
	    

	    public void addNewAffectationObject(Affectation aff) {
	       affectations.add(aff);
	    }
	    
	    @Override
	    public void deleteAffectation(int id_a) {
	       Affectation affectation = null;
	       for(Affectation a : affectations){
	           if(a.getId() == id_a){
	              affectation = a;
	           }
	       }
	       if(affectation == null){
	           System.out.println("You should check your input");
	           return;
	       }
	       affectations.remove(affectation);
	    }
	   
}
