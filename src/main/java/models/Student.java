package models;

import jakarta.persistence.Entity;
import jakarta.persistence.

@Entity
@Table(name="students")
@Getter
@Setter
public class Student {
    @id
    private int id;
    private String name;
    private String major;
}
