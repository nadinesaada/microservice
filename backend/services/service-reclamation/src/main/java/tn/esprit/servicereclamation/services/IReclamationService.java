package tn.esprit.servicereclamation.services;

import java.util.List;

import tn.esprit.servicereclamation.entities.Reclamation;


public interface IReclamationService {

	
	public List<Reclamation> getAllReclamations();
	
	public Reclamation getReclamationById(Long id);
	
	public Reclamation addReclamation(Reclamation reclamation);
	
	public Reclamation updateReclamation(Reclamation reclamation);
	
	public Boolean deleteReclamationById(Long recId);
}
