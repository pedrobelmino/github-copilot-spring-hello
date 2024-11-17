package br.com.pedrobelmino.openai.spring.hello.service;

import br.com.pedrobelmino.openai.spring.hello.entity.Categoria;
import br.com.pedrobelmino.openai.spring.hello.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }

    public Optional<Categoria> findByNome(String nome) {
        return categoriaRepository.findByNome(nome);
    }

    public void deleteByNome(String nome) {
        categoriaRepository.deleteByNome(nome);
    }

    public boolean validaCategoria(Categoria categoria) {
        return Optional.ofNullable(categoria)
                .map(Categoria::getNome)
                .isPresent();
    }

}