package com.marcelodias.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelodias.cursomc.domain.Cliente;
import com.marcelodias.cursomc.repositories.ClienteRepository;
import com.marcelodias.cursomc.services.Exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ",Tipo:" +Cliente.class.getName());
		}
		return obj;
	}

}
