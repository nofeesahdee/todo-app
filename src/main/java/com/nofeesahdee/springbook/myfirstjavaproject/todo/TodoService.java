package com.nofeesahdee.springbook.myfirstjavaproject.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;
    static{
        todos.add(new Todo(1, "Learn Java","in28minutes",LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Learn Springboot","in28minutes",LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "GRE","in28minutes",LocalDate.now().plusYears(3), false));
        todos.add(new Todo(4, "Learn DSA","in28minutes",LocalDate.now().plusYears(4), false));
    }
    public List<Todo> findByUsername(){
        
    }
}
