package mzaenalmustopa.todolistjavadasaraplikasi.test.service;

import mzaenalmustopa.todolistjavadasaraplikasi.entity.TodoList;
import mzaenalmustopa.todolistjavadasaraplikasi.repository.TodoListRepo;
import mzaenalmustopa.todolistjavadasaraplikasi.repository.TodoListRepoImpl;
import mzaenalmustopa.todolistjavadasaraplikasi.service.TodoListService;
import mzaenalmustopa.todolistjavadasaraplikasi.service.TodoListServiceImpl;

public class TodoListTestServiceTest {

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepoImpl todoListRepo = new TodoListRepoImpl();
        todoListRepo.data[0] = new TodoList("Belajar Java Dasar");
        todoListRepo.data[1] = new TodoList("Belajar Java OOP");
        todoListRepo.data[2] = new TodoList("Belajar Java Standard Classes");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepo);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepo todoListRepo = new TodoListRepoImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepo);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();
    }

    public  static void testRemoveTodoList(){
        TodoListRepo todoListRepo = new TodoListRepoImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepo);


        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(1);
        todoListService.showTodoList();
    }
}
