package fr.aberwag.universite.enseignant.repository;

import java.util.List;

import fr.aberwag.universite.enseignant.domain.Enseignant;

public interface IEnseignantRepository {

	List<Enseignant> findAll();

	Enseignant getOne(Integer id);

	Enseignant save(Enseignant enseignant);

}
