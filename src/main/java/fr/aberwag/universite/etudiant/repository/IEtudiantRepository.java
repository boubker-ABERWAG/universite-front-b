package fr.aberwag.universite.etudiant.repository;

import java.util.List;

import fr.aberwag.universite.etudiant.domain.Etudiant;

public interface IEtudiantRepository {

	List<Etudiant> findAll();

	Etudiant getOne(Integer id);

}
