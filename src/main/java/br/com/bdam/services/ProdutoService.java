/**
 * 
 */
package br.com.bdam.services;

import br.com.bdam.dao.IProdutoDAO;
import br.com.bdam.domain.Produto;
import br.com.bdam.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
