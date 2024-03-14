package mzaenalmustopa.todolistjavadasaraplikasi.test.view;

import mzaenalmustopa.todolistjavadasaraplikasi.repository.TodoListRepo;
import mzaenalmustopa.todolistjavadasaraplikasi.repository.TodoListRepoImpl;
import mzaenalmustopa.todolistjavadasaraplikasi.service.TodoListService;
import mzaenalmustopa.todolistjavadasaraplikasi.service.TodoListServiceImpl;
import mzaenalmustopa.todolistjavadasaraplikasi.view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepo todoListRepo = new TodoListRepoImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepo);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListView.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepo todoListRepo = new TodoListRepoImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepo);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();
        todoListView.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepo todoListRepo = new TodoListRepoImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepo);
        TodoListView todoListView = new TodoListView(todoListService);


        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();

        todoListView.removeTodoList();

        todoListService.showTodoList();
    }
}
