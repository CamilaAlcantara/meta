package com.meta.philips.metaphilips.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;


@Entity
@Table(name="CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public long id;
	@NotNull
	@Column(name = "NOME")
	public String nome;
	@NotNull
	@Column(name = "SOBRENOME")
	public String sobrenome;
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "DATA_NASCIMENTO")
	public LocalDate dataNascimento;
	@NotNull
	@Column(name = "CPF")
	public String cpf;
	@NotNull
	@Column(name = "TELEFONE")
	public String telefone;
	@NotNull
	@Column(name = "ENDERECO")
	public String endereco;
	
	@Column(name = "SEG_ENDERECO")
	public String segundoEndereco;
	@NotNull
	@Column(name = "ATIVO")
	public boolean ativo;

}
