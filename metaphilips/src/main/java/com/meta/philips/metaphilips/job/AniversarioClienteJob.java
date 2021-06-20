package com.meta.philips.metaphilips.job;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.meta.philips.metaphilips.interfaceService.ClienteInterfaceService;
import com.meta.philips.metaphilips.models.Cliente;

@Component @EnableScheduling 
public class AniversarioClienteJob {
	
	@Autowired
	ClienteInterfaceService clienteService;
	
	
	@Scheduled(cron = "0 01 12 * * *")
	public List<Cliente> verificaAniversario() throws Exception {
		
		List<Cliente> listaCliente =  clienteService.listar();
		LocalDate hoje = LocalDate.now();
		String hojeAniversario = hoje.getMonthValue() + "-" + hoje.getDayOfMonth();
		List<Cliente> listaObj = new ArrayList<Cliente>();
		
		for(Cliente obj: listaCliente) {
			String objAniversario = obj.dataNascimento.getMonthValue() + "-" + obj.dataNascimento.getDayOfMonth();
			
			
			if(objAniversario.equals(hojeAniversario)){
				System.out.println(
					     obj.nome +  " " + obj.sobrenome +  " hoje é seu aniversário. Parabéns !!! \n");	
				
				listaObj.add(obj);
				
			}else {
				System.out.println(
				     obj.nome +  " " + obj.sobrenome +  " hoje não é seu aniversário! \n");
			}
			
		}
		
		// retorna uma lista com os aniversariante do dia
		return listaObj;
		
			
		
	}

}
