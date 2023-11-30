package tn.enig.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tn.enig.dao.Dao;
import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

@Controller
public class App {
	Dao d;

	public App() {
		d = new Dao();
	}

	@GetMapping("/matieres")
	public String home(Model x) {
		List<Matiere> ls = d.getAllMatieres();
		x.addAttribute("subjects", ls);
		return "home";
	}

	@GetMapping("/enseignants")
	public String tableEns(Model x) {
		List<Enseignant> le = d.getAllEnseignants();
		x.addAttribute("enseignants", le);
		for (Enseignant matiere : le) {
			System.out.println("ID: " + matiere.getId());
			System.out.println("Titre: " + matiere.getNom());
			System.out.println(); // Add an empty line for separation
		}
		return "tableEns";
	}

	@GetMapping("/affectations")
	public String tableAffectation(Model x) {
		List<Affectation> le = d.getAllAffectations();
		x.addAttribute("affectations", le);
		return "tableAffectation";
	}

	@GetMapping("/addMatiere")
	public String addMatiere(Model x) {
		Matiere m = new Matiere();
		x.addAttribute("matiere", m);
		return "addMatiere";
	}

	@PostMapping("/addMatiere")
	public String addMatierePost(@ModelAttribute("matiere") Matiere m) {
		d.addNewMatiere(m);
		System.out.println("Add new matiere " + m);
		return "redirect:/matieres";
	}

	@GetMapping("/addEnseignant")
	public String addEnseignant(Model x) {
		Enseignant ens = new Enseignant();
		x.addAttribute("enseignant", ens);
		return "addEnseignant";
	}

	@PostMapping("/addEnseignant")
	public String addEnseignantPost(@ModelAttribute("enseignant") Enseignant ens) {
		d.addNewEnseignant(ens);
		System.out.println("Add new enseignant " + ens);
		return "redirect:/enseignants";
	}

	@GetMapping("/addAffectation")
	public String addAffectation(Model x) {
		List<Enseignant> ensListe = d.getAllEnseignants();
		List<Matiere> matListe = d.getAllMatieres();
		x.addAttribute("enseignants", ensListe);
		x.addAttribute("matieres", matListe);
		x.addAttribute("affectation", new Affectation());
		return "addAffectation";
	}

	@PostMapping("/addAffectation")
	public String addAffectation(@ModelAttribute("affectation") Affectation aff) {
		d.addNewAffectation(aff.getEns().getId(), aff.getMat().getId(), aff.getNbh());
		System.out.println("Add new affectation " + aff);
		return "redirect:/affectations";
	}

	@GetMapping("/DeleteAffect/{id}")
	public String deleteAffectation(@PathVariable("id") int id,Model x) {
		d.deleteAffectation(id);
		List<Affectation> le = d.getAllAffectations();
		x.addAttribute("affectations", le);
		return "redirect:/affectations";
	}

}
