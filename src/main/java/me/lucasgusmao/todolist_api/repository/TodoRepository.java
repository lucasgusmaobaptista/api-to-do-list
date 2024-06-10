package me.lucasgusmao.todolist_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.lucasgusmao.todolist_api.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
  
}
