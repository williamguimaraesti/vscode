package br.com.isiflix.appmercado.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.isiflix.appmercado.model.Produto;
import br.com.isiflix.appmercado.repositorio.ProdutoRepo;
import br.com.isiflix.appmercado.service.ProdutoServiceImp;

@SpringBootTest
@ActiveProfiles("test")
@DisplayName("Teste de funcionamento dos casos de uso.")
public class ProdutoTests {

    @InjectMocks
    private ProdutoServiceImp service;

    @Mock
    private ProdutoRepo repo;

    private Integer existingId = 1;
    private Integer nonExistingId = 100;
    private String Keyword = "bolacha";
    private Produto newProduto;
    private Produto createdProduto;
    private ArrayList <Produto> listaDeVariosProdutos;

    @BeforeEach
    public void setup() throws Exception{
        newProduto = new Produto();
        newProduto.setNome("Bolacha");

        createdProduto = new Produto();
        createdProduto.setId(1);
        createdProduto.setNome("Bolacha");

        listaDeVariosProdutos = new ArrayList<Produto>();
        Produto p1, p2;
        p1 = new Produto();
        p1.setId(2);
        p1.setNome("Bolacha recheada");
        p2 = new Produto();
        p2.setId(3);
        p2.setNome("Bolacha agua e sal");

        Mockito.when(repo.save(newProduto)).thenReturn(createdProduto);
        Mockito.when(repo.findById(existingId)).thenReturn(Optional.of(createdProduto));
        Mockito.when(repo.findById(nonExistingId)).thenReturn(Optional.ofNullable(null));
        Mockito.when(repo.findALLByNomeContaining("Biscoito")).thenReturn(new ArrayList<Produto>());
        Mockito.when(repo.findALLByNomeContaining(Keyword)).thenReturn(listaDeVariosProdutos);
    }

    @Test
    public void deveriaCadastrarProduto(){
        assertEquals(service.criarNovoProduto(newProduto), createdProduto);
    }

    @Test
    public void deveriaRetornarPeloId(){
        assertNotNull(service.buscarPorId(existingId));
    } 

    @Test
    public void deveriaNaoEncontrarId(){
        assertNull(service.buscarPorId(nonExistingId));
    }

    @Test
    public void deveriaRetornarListaComPalavraChave(){
        assertFalse(service.buscarPorPalavraChave(Keyword).size() > 0);
    } 

    @Test
    public void deveriaRetornarListaVazia(){
        assertTrue(service.buscarPorPalavraChave("Biscoito").size() == 0);
    }
}