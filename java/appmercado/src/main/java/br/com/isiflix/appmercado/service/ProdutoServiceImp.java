package br.com.isiflix.appmercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.isiflix.appmercado.model.Produto;
import br.com.isiflix.appmercado.repositorio.ProdutoRepo;

@Component
public class ProdutoServiceImp implements IProdutoService{

    @Autowired
    private ProdutoRepo repo;

    @Override
    public Produto criarNovoProduto(Produto prod) {
        if(prod.getNome() == null || prod.getNome().length() == 0)
            return null;
        return repo.save(prod);
    }

    @Override
    public List<Produto> listarTodods() {
        
        return (List<Produto>)repo.findAll();
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String Key) {
        
        return repo.findALLByNomeContaining(Key);
    }

    @Override
    public Produto buscarPorId(Integer id) {
        
        return repo.findById(id).orElse(null);
    }   
}