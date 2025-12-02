package Manager.task.RESTfulApi.repository;

import Manager.task.RESTfulApi.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
