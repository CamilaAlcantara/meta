package com.meta.philips.metaphilips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.meta.philips.metaphilips.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	@Query(value="SELECT * FROM CLIENTE WHERE CPF LIKE ?1 AND ATIVO = TRUE",nativeQuery = true)
	public Cliente buscarClientePorCpf(	String cpf);
	
//	query criada para verificar se o Id existe e retornar um obj Cliente caso exista 

	@Query(value="SELECT * FROM CLIENTE WHERE ID = ?1 AND ATIVO = TRUE",nativeQuery = true)
	public Cliente verificaId(long id);

	
}
