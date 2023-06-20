package br.com.isiflix.appmercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.isiflix.appmercado.model.ItemLista;
import br.com.isiflix.appmercado.repositorio.ItemListaRepo;

@Component
public class ItemListaServiceImp implements IItemListaService{

    @Autowired
    private ItemListaRepo repo;
    @Override
    public ItemLista inserirItem(ItemLista novo) {
        return repo.save(novo);
    }

    @Override
    public ItemLista alterarItem(ItemLista item) {
        return repo.save(item);
    }

    @Override
    public void removerItem(Integer numSeq) {
        repo.deleteById(numSeq);
    }   
}