package com.nofeesahdee.springbook.myfirstjavaproject.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    private TodoService todoService;

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("in28minutes");
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value="add-todo", method=RequestMethod.GET)
    public String showNewTodoPage() {
        return "addTodos";
    }

    @RequestMapping(value="add-todo", method=RequestMethod.POST)
    public String addNewTodo() {
        return "redirect:list-todos";
    }
}
