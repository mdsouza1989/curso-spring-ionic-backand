package com.marcelodias.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelodias.cursomc.domain.Pedido;
import com.marcelodias.cursomc.repositories.PedidoRepository;
import com.marcelodias.cursomc.services.Exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ",Tipo:" +Pedido.class.getName());
		}
		return obj;
	}

}
