package com.meta.philips.metaphilips.interfaceService;

import java.util.List;
import java.util.Optional;

import com.meta.philips.metaphilips.models.Cliente;

public interface ClienteInterfaceService {

	List<Cliente> listar() throws Exception;
	Cliente buscarClientePorCpf(String cpf) throws Exception;
	Optional<Cliente> buscarPorId(long id) throws Exception;
	Cliente incluir(Cliente entity) throws Exception;
	Cliente alterar(Cliente entity) throws Exception;
	void delete(Cliente entity) throws Exception;


}
