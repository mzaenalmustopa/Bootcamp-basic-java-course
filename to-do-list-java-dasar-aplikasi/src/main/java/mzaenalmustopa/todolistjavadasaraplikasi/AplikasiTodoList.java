package mzaenalmustopa.todolistjavadasaraplikasi;

import mzaenalmustopa.todolistjavadasaraplikasi.repository.TodoListRepo;
import mzaenalmustopa.todolistjavadasaraplikasi.repository.TodoListRepoImpl;
import mzaenalmustopa.todolistjavadasaraplikasi.service.TodoListService;
import mzaenalmustopa.todolistjavadasaraplikasi.service.TodoListServiceImpl;
import mzaenalmustopa.todolistjavadasaraplikasi.view.TodoListView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AplikasiTodoList {

    public static void main(String[] args) {
        TodoListRepo todoListRepo = new TodoListRepoImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepo);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
