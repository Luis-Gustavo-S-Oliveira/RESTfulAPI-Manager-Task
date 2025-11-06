package Manager.task.RESTfulApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_projetos")
public class Projetos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
