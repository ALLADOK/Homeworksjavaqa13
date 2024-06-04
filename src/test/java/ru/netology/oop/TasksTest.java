package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {


    @Test
    public void shouldChooseText() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        simpleTask.matches("Позвонить родителям");

        System.out.println(simpleTask.matches("Позвонить родителям"));

    }

    @Test
    public void shouldChooseText1() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        simpleTask.matches("");

        System.out.println(simpleTask.getTitle());

    }

    @Test
    public void shouldChooseText2() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        simpleTask.matches("");


        System.out.println(simpleTask.matches("Во вторник после обеда"));


    }

    @Test
    public void shouldChooseText3() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.matches("Выкатка 3й версии приложения");
        meeting.matches("Приложение НетоБанка");

        System.out.println(meeting.matches("Выкатка 3й версии приложения"));
        System.out.println(meeting.matches("Приложение НетоБанка"));
    }

    @Test
    public void shouldChooseText4() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.matches("");
        meeting.matches("");

        System.out.println(meeting.matches("Во вторник после обеда"));
        System.out.println(meeting.matches("Во вторник после обеда"));
    }

    @Test
    public void shouldChooseText5() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        meeting.matches("Выкатка 3й версии приложения");
        meeting.matches("Приложение НетоБанка");
        meeting.matches("Во вторник после обеда");

        System.out.println(meeting.getTopic());
        System.out.println(meeting.getProject());
        System.out.println(meeting.getStart());
    }

    @Test
    public void shouldChooseText6() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);


        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldChooseText7() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        epic.matches("Молоко");
        epic.matches("Яйца");
        epic.matches("Хлеб");

        System.out.println(epic.matches("Молоко"));
        System.out.println(epic.matches("Яйца"));
        System.out.println(epic.matches("Хлеб"));

    }

    @Test
    public void shouldChooseText8() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        epic.matches("");
        epic.matches("");
        epic.matches("");

        System.out.println(epic.matches("Птица"));
        System.out.println(epic.matches("Птица"));
        System.out.println(epic.matches("Птица"));

    }


    @Test

    public void shouldEqualsId() {
        Task task = new Task(5);

        task.equals(5);

        System.out.println(task.equals(5));

    }

    @Test

    public void shouldEqualsId1() {
        Task task = new Task(0);

        task.equals(0);

        System.out.println(task.id);

    }

    @Test

    public void shouldEqualsId2() {
        Task task = new Task(5);

        task.equals(task.id);

        System.out.println(task.id);

    }


    @Test

    public void shouldMatchesQuery() {
        Task task = new Task(0);

        task.matches("");

        System.out.println(task.matches(""));
    }

    @Test

    public void shouldMatchesQuery1() {

        Task task = new Task(0);


        System.out.println(task.equals(task));
        ;


    }

    @Test

    public void shouldMatchesQuery2() {
        Task task = new Task(5);

        task.equals(5);

        System.out.println(task.getClass(5));
    }

    @Test

    public void shouldMatchesQuery3() {

        Task[] result = new Task[5];


        System.out.println(result.equals(6));
        ;


    }

    @Test

    public void shouldMatchesQuery4() {
        Task task = new Task(5);

        task.equals(5);

        System.out.println(task.getId());
    }

    @Test

    public void shouldMatchesQuery5() {

        Task task1 = new Task(1);
        Task task2 = new Task(2);
        Task task3 = new Task(3);
        Task task4 = null;


        System.out.println(task1 == task1);
        System.out.println(task1 == task2);
        System.out.println(task1 == task3);
        System.out.println(task1 == task4);

        System.out.println(task1.equals(task1));
        System.out.println(task1.equals(task2));
        System.out.println(task1.equals(task3));
        System.out.println(task1.equals(task4));
    }

    @Test

    public void shouldMatchesQuery6() {

        Task task = new Task(0);
        Task task1 = new Task(1);
        Task task2 = new Task(2);
        Task task3 = new Task(3);

        System.out.println(0 == task.id);
        System.out.println(1 == task1.id);
        System.out.println(2 == task2.id);
        System.out.println(3 == task3.id);

        Assertions.assertEquals(task.id, 0);
        Assertions.assertEquals(task1.id, 1);
        Assertions.assertEquals(task2.id, 2);
        Assertions.assertEquals(task3.id, 3);
    }

    @Test
    public void shouldMatchesQuery7() {
        Task task = new Task(0);

        task.id = 5;

        System.out.println(0 == task.id);
    }
}