package com.meta.philips.metaphilips.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meta.philips.metaphilips.interfaceService.ClienteInterfaceService;
import com.meta.philips.metaphilips.models.Cliente;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value="/cliente")
public class ClienteController {

	
	@Autowired
	ClienteInterfaceService clienteService;
	
		
	@GetMapping("/listar")
	public List<Cliente> listar() throws Exception{
				
		return clienteService.listar();
	}

	@GetMapping("buscarClientePorCpf/{cpf}")
	public Cliente buscarClientePorCpf(@PathVariable("cpf") String cpf) throws Exception{
				
		return clienteService.buscarClientePorCpf(cpf);
	}
	
	@PostMapping("/incluir")
	public Cliente incluir(@RequestBody Cliente entity) throws Exception {
		return	clienteService.incluir(entity);
	}
	
	@GetMapping("/buscarPorId/{id}")
	public Optional<Cliente> buscarPorId(@PathVariable("id") long id) throws Exception{
	 		return clienteService.buscarPorId(id);
	}
	@PutMapping("/alterar")
	public Cliente alterar(@RequestBody Cliente entity) throws Exception {
		return clienteService.alterar(entity);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Cliente entity) throws Exception {
		 clienteService.delete(entity);
	}
}
