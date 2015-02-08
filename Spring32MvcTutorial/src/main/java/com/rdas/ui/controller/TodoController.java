package com.rdas.ui.controller;

import java.util.List;

import com.rdas.ui.service.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.rdas.ui.model.Todo;
import javax.annotation.Resource;

/**
 * Created by rdas on 29/01/2015.
 */
@Controller
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private EmbeddedDatabase database;

    @Autowired
    private TodoRepository todoRepository;

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String showTodo(ModelMap model) {
        return "angviews/ang-todo-dash";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody
    List<Todo> persons() {
        return todoRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody Todo create(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        todoRepository.delete(id);
    }

}
