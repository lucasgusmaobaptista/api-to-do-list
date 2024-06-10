package me.lucasgusmao.todolist_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.lucasgusmao.todolist_api.entity.Todo;
import me.lucasgusmao.todolist_api.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
  private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }
  
  @PostMapping
  List<Todo> create(@RequestBody Todo todo) {
    return service.create(todo);
  }

  @GetMapping
  List<Todo> list() {
    return service.list();
  }

  @PutMapping("{id}")
  List<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
    return service.update(todo);
  }

  @DeleteMapping("{id}")
  List<Todo> delete(@PathVariable Long id) {
    return service.delete(id);
  }
}
