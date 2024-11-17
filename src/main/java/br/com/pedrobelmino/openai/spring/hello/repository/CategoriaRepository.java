package br.com.pedrobelmino.openai.spring.hello.repository;

import br.com.pedrobelmino.openai.spring.hello.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}