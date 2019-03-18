package fr.aberwag.universite.etudiant.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.aberwag.universite.etudiant.domain.Etudiant;
import fr.aberwag.universite.etudiant.repository.IEtudiantRepository;

@Repository
public class EtudiantRepositoryImpl 
implements IEtudiantRepository {

	@Override
	public List<Etudiant> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
