package eu.fluppe.services;

import java.util.List;
import eu.fluppe.repository.InsultRepository;
import eu.fluppe.model.Insult;


public class InsultServiceImpl implements InsultService {
	private InsultRepository insultRepository;

	public List<Insult> findAll() {
		return insultRepository.findAll();
	}

	public void setInsultRepository(InsultRepository insultRepository) {
		this.insultRepository = insultRepository;
	}
}