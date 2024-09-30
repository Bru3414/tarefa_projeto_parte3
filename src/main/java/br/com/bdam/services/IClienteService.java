/**
 * 
 */
package br.com.bdam.services;

import br.com.bdam.domain.Cliente;
import br.com.bdam.exceptions.DAOException;
import br.com.bdam.exceptions.TipoChaveNaoEncontradaException;
import br.com.bdam.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
