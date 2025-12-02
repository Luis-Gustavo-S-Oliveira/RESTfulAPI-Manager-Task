package Manager.task.RESTfulApi.service;

import Manager.task.RESTfulApi.model.Project;
import Manager.task.RESTfulApi.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> projectsFindAll() {
        return projectRepository.findAll();
    }

    public Project projectCreate(Project project) {
        return projectRepository.save(project);
    }

    public String projectDelete(Project project) {
        projectRepository.deleteById(project.getId());
        return "Project deleted successfully";
    }
}
