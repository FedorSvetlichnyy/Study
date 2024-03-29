package Part2.TodoList;

import java.util.ArrayList;
import java.util.Arrays;

public class TodoList {

    ArrayList<String> todoList = new ArrayList<>();


    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        todoList.add(index, todo);
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        todoList.set(index, todo);
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        todoList.remove(index);
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return new ArrayList<>();
    }

    public void list() {
        System.out.println("Список дел: ");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + " - " + todoList.get(i));
        }
    }
    public int size(){
        return todoList.size();
    }

}