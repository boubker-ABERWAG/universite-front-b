package fr.aberwag.universite.matiere.repository;

import java.util.List;

import fr.aberwag.universite.matiere.domain.Matiere;

public interface IMatiereRepository {

	List<Matiere> findAll();

	Matiere getOne(Integer id);

	Matiere save(Matiere matiere);

}
