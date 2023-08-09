package org.cursjava.EXTRA_EXERCITII.EnumsIO_practice.Ex1;

public class Task {
    private String name;
    private String priority;

    public Task(String name,String priority) {
        this.name = name;
        this.priority = priority;
    }



    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
