package com.todoapp.todo_list.controller;

import com.todoapp.todo_list.entity.Todo;
import com.todoapp.todo_list.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService service;

    @PostMapping
    public List<Todo> create(@RequestBody Todo todo) {
        return service.create(todo);
    }

    @GetMapping
    public List<Todo> list() {
        return service.list();
    }
    
    @PostMapping
    public List<Todo> update(@RequestBody Todo todo) {
        return service.create(todo);
    }

    @DeleteMapping("{id}")
    public List<Todo> delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}
