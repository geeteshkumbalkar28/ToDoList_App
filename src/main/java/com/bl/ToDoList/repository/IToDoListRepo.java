package com.bl.ToDoList.repository;

import com.bl.ToDoList.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface IToDoListRepo extends JpaRepository<User, Integer> {
}
