package Manager.task.RESTfulApi.model;

import jakarta.persistence.*;

@Entity(name ="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;
    private String email;

    public long getId() {
        return id;
    }
}
