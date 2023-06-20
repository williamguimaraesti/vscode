package br.com.isiflix.appmercado.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.isiflix.appmercado.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{
    public List<Produto> findALLByNomeContaining(String palavraChave); /*Comando JPA correspondente ao comando SQL para realizar uma consulta no banco -SELECT * FROM tbl_produto WHERE nome LIKE  <palavraChave> -*/
    
}