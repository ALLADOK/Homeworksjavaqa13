package ru.netology.oop;

import java.util.Objects;

public class Task {
    protected int id;

    public Task(int id) {
        this.id = id;
    }

    public boolean matches(String query) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

}