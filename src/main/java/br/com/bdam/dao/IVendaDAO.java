/**
 * 
 */
package br.com.bdam.dao;

import br.com.bdam.dao.generic.IGenericDAO;
import br.com.bdam.domain.Venda;
import br.com.bdam.exceptions.DAOException;
import br.com.bdam.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
