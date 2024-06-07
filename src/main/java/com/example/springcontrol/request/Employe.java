package com.example.springcontrol.request;

import com.example.springcontrol.Model.ProjectEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "employe")
public class Employe {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    @ManyToMany
    @JoinTable(
            name = "employe_project",
            joinColumns = @JoinColumn(name = "employe_id"),
            inverseJoinColumns =
            @JoinColumn(name = "project_id")
    )
    private List<ProjectEntity> projects;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public List<ProjectEntity> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectEntity> projects) {
        this.projects = projects;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
