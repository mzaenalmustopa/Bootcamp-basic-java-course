package mzaenalmustopa.todolistjavadasaraplikasi.repository;

import mzaenalmustopa.todolistjavadasaraplikasi.entity.TodoList;

public class TodoListRepoImpl implements TodoListRepo {

    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull() {
        // cek apakah model penuh
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                isFull = false;
                break;
            }
        }

        return isFull;
    }

    public void resizeIfFull() {
        // jika penuh, kita resize ukuran array 2x lipat
        if (isFull()) {
            var tempo = data;
            data = new TodoList[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                data[i] = tempo[i];
            }
        }
    }

    @Override
    public void add(TodoList todoList) {
        resizeIfFull();

        // tambahkan ke posisi yang data array nya NULL
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todoList;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if ((number - 1) >= data.length) {
            return false;
        } else if (data[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < data.length; i++) {
                if (i == (data.length - 1)) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }
}
