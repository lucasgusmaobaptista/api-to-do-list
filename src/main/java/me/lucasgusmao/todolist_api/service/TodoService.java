package me.lucasgusmao.todolist_api.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import me.lucasgusmao.todolist_api.entity.Todo;
import me.lucasgusmao.todolist_api.repository.TodoRepository;

@Service
public class TodoService {
  private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

  public List<Todo> create(Todo todo) {
    repository.save(todo);
    return list();
  }

  public List<Todo> list() {
    Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
    return repository.findAll(sort);
  }

  public List<Todo> update(Todo todo) {
    repository.save(todo);
    return list();
  }

  public List<Todo> delete(Long id) {
    repository.deleteById(id);
    return list();
  }
  
}
