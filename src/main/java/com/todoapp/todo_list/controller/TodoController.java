package com.todoapp.todo_list.controller;

import com.todoapp.todo_list.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @Autowired
    private TodoService service;
}
