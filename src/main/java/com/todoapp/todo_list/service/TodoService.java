package com.todoapp.todo_list.service;

import com.todoapp.todo_list.entity.Todo;
import com.todoapp.todo_list.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> create(Todo todo) {
        repository.save(todo);
        return list();
    }
    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome"));
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
