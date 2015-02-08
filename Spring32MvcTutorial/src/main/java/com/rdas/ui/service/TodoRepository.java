package com.rdas.ui.service;

import com.google.common.collect.Lists;
import com.rdas.ui.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

/**
 * Created by rdas on 29/01/2015.
 */
//public interface TodoRepository extends JpaRepository<Todo, Integer> {
//}
@Component
public class TodoRepository {

    private List<Todo> todoList;
    @PostConstruct
    public void setup() {
        Todo t1 = new Todo(1, "Task 1", new Date());
        Todo t2 = new Todo(2, "Task 2", new Date());
        Todo t3 = new Todo(3, "Task 3", new Date());
        todoList = Lists.newArrayList(t1, t2, t3);
    }

    public List<Todo> findAll() {
        return todoList;
    }

    public Todo save(Todo todo) {
        return todo;
    }

    public void delete(Integer id) {
        return ;
    }
}