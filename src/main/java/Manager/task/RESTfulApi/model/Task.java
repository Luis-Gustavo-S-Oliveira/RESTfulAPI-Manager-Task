package Manager.task.RESTfulApi.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "tb_Task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tb_id")
    Long id;

    String titulo;

    @Column(length = (100))
    String descricao;

    @ManyToOne
    @JoinColumn(name = "id_category")
    Category category;

    LocalDate dataLimite;

    @ManyToOne
    @JoinColumn(name = "project_tb_id")
    Project project;

    String prioridade;

    String status;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}