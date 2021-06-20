package com.meta.philips.metaphilips.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.meta.philips.metaphilips.interfaceService.ClienteInterfaceService;
import com.meta.philips.metaphilips.models.Cliente;
import com.meta.philips.metaphilips.repository.ClienteRepository;

@Service
public class ClienteService implements ClienteInterfaceService{
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	@Override
	public List<Cliente> listar(){
				
		return clienteRepository.findAll();
	}
	@Override
	public Cliente buscarClientePorCpf(String cpf){
		
		Cliente cliente = clienteRepository.buscarClientePorCpf(cpf);
		
		return cliente;
		
	}
	
	@Override
	public Optional<Cliente> buscarPorId(@PathVariable("id") long id){
	 		return this.clienteRepository.findById(id);
	}
	
	@Override
	public Cliente incluir(@RequestBody Cliente entity) {
		
		//validar cpf para poder incluir 
		Cliente clienteValido = buscarClientePorCpf(entity.cpf);
		
		if(clienteValido != null) {
			return null;
		}else {
			return this.clienteRepository.save(entity);
			
		}
		
		
	}
	@Override
	public Cliente alterar(@RequestBody Cliente entity) {
		return this.clienteRepository.save(entity);
	}
	@Override
	public void delete(@RequestBody Cliente entity) {
		 this.clienteRepository.delete(entity);
	}


	

}
