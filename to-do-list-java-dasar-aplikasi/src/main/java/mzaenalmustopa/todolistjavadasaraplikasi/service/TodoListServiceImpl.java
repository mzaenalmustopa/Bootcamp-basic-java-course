package mzaenalmustopa.todolistjavadasaraplikasi.service;

import mzaenalmustopa.todolistjavadasaraplikasi.entity.TodoList;
import mzaenalmustopa.todolistjavadasaraplikasi.repository.TodoListRepo;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepo todoListRepo;

    public TodoListServiceImpl(TodoListRepo todoListRepo) {
        this.todoListRepo = todoListRepo;
    }

    @Override
    public void showTodoList() {
        TodoList[] model = todoListRepo.getAll();

        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ", " + todo.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepo.add(todoList);
        System.out.println("SUKSES MENAMBAH TODO : " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todoListRepo.remove(number);
        if (success) {
            System.out.println("SUKSES MENGHAPUS TODO : " + number);
        } else {
            System.out.println("GAGAL MENGHAPUS TODO : " + number);
        }
    }
}
