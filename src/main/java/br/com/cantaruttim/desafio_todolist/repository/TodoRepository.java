package br.com.cantaruttim.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cantaruttim.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    // acesso ao banco
}
