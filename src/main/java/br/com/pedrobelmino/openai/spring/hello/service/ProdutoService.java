package br.com.pedrobelmino.openai.spring.hello.service;

import br.com.pedrobelmino.openai.spring.hello.entity.Produto;
import br.com.pedrobelmino.openai.spring.hello.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }

    public Produto update(Long id, Produto produto) {
        return produtoRepository.save(produto);
    }

    // crie um método que deleta um produto por nome
    public void deleteByNome(String nome) {
        produtoRepository.deleteByNome(nome);
    }
}