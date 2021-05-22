package app.noha.ppmtool.services;

import app.noha.ppmtool.domain.Project;
import app.noha.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        // Logic
        return projectRepository.save(project);
    }
}
