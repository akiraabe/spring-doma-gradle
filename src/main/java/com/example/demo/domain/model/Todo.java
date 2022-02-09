package com.example.demo.domain.model;

import lombok.Data;
import lombok.ToString;
import org.seasar.doma.*;

@Data
@ToString
@Entity
@Table(name = "todos")
public class Todo {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
}
