package br.com.isiflix.appmercado.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.isiflix.appmercado.model.ItemLista;

public interface ItemListaRepo extends CrudRepository <ItemLista, Integer>{
    
}
