package com.devprojects.pontointeligente.api.services;

import java.util.Optional;

import com.devprojects.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	
	/**
	 * 
	 * Retorna o objeto empresa para o método que o chamou
	 * 	 
	 * */
	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * 
	 * Cadastra uma nova empresa no BD
	 * 
	 * @param empresa 
	 * @return Empresa
	 * 	 
	 * */
	Empresa persistir(Empresa empresa);
	

}
