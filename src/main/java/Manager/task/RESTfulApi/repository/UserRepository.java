package Manager.task.RESTfulApi.repository;



import Manager.task.RESTfulApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
}