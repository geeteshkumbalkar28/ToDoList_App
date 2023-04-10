package com.bl.ToDoList.dto;

public class ToDoListDTO {
    public String name;
    public String description;

    @Override
    public String toString() {
        return "ToDoListDTO{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
