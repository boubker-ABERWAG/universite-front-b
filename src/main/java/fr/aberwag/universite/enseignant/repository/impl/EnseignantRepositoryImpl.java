package fr.aberwag.universite.enseignant.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.aberwag.universite.enseignant.domain.Enseignant;
import fr.aberwag.universite.enseignant.repository.IEnseignantRepository;

@Repository
public class EnseignantRepositoryImpl implements IEnseignantRepository{

	RestTemplate rt = new RestTemplate();
	
	@Override
	public List<Enseignant> findAll() {
		List<Enseignant> liste = rt.exchange(
				"http://localhost:8080/enseignants",
				 HttpMethod.GET,
				 null,
				 new ParameterizedTypeReference<List<Enseignant>>(){}
				).getBody() ;
		return liste;
	}

	@Override
	public Enseignant getOne(Integer id) {
		String url = "http://localhost:8080/enseignants/" + id;
		Enseignant e = 
				rt.getForObject(
						url, 
						Enseignant.class
				);
		return e;
	}

	@Override
	public Enseignant save(Enseignant enseignant) {
		// TODO Auto-generated method stub
		return null;
	}



}
