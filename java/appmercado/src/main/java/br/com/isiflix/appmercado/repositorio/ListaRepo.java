package br.com.isiflix.appmercado.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.isiflix.appmercado.model.Lista;

public interface ListaRepo extends CrudRepository <Lista, Integer> {
    
}
