package Manager.task.RESTfulApi.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name ="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    String senha;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Project> projects = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Task> tasksIndependent = new ArrayList<>();

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Task> getTasksIndependent() {
        return tasksIndependent;
    }

    public void setTasksIndependent(List<Task> tasksIndependent) {
        this.tasksIndependent = tasksIndependent;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

}
