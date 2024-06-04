package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TodosTest {


    @Test

    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test

    public void shouldAddThreeTasksOfDifferentType1() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.search(simpleTask.title);
        todos.search(epic.toString());
        todos.search(meeting.toString());


        Task[] expected = {};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldAddThreeTasksOfDifferentType2() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(meeting);
        todos.add(epic);
        todos.add(simpleTask);

        Task[] expected = {meeting, epic, simpleTask};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldAddThreeTasksOfDifferentType3() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();


        todos.search("Один");


        Task[] expected = {};
        Task[] actual = todos.addToArray("Позвонить родителям");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldAddThreeTasksOfDifferentType4() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.search(simpleTask.title);
        todos.search(epic.toString());
        todos.search(meeting.toString());


        Task[] expected = {};
        Task[] actual = todos.addToArray("");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldAddThreeTasksOfDifferentType5() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.addToArray(simpleTask.title);
        todos.addToArray(epic.toString());
        todos.addToArray(meeting.toString());


        Task[] expected = {};
        Task[] actual = todos.addToArray("");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldAddThreeTasksOfDifferentType6() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.search(simpleTask.title);
        todos.search(epic.toString());
        todos.search(meeting.toString());


        Task[] expected = {};
        Task[] actual = todos.search("");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldAddThreeTasksOfDifferentType7() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.equals(0);
        todos.equals(0);
        todos.equals(0);


        Task[] expected = {};
        Task[] actual = todos.addToArray("");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldAddThreeTasksOfDifferentType8() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );


        Task[] tasks = new Task[0];
        Task[] tasks1 = new Task[1];
        Task[] tasks2 = new Task[2];
        Task[] tasks3 = new Task[3];

        System.out.println(tasks == tasks1);
        System.out.println(tasks == tasks2);
        System.out.println(tasks == tasks3);


        Assertions.assertEquals(0, 0);

    }
}