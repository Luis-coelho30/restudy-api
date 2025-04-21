package me.restudy_api.domain.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Subject> subjects;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Task> tasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Subject> getDisciplinas() {
        return subjects;
    }

    public void setDisciplinas(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Set<Task> getTarefas() {
        return tasks;
    }

    public void setTarefas(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
